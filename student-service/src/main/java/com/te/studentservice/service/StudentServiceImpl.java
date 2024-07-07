package com.te.studentservice.service;


import com.te.addressapp.entity.Address;
import com.te.studentservice.dto.StudentDTO;
import com.te.studentservice.enity.Student;
import com.te.studentservice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;
    private final RestTemplate restTemplate;

    @Override
    public String inserData(StudentDTO studentDto) {

        Student student = modelMapper.map(studentDto, Student.class);
        studentRepository.save(student);

        String patchedForObject = restTemplate
                .postForObject("http://localhost:9091/address/insertaddress", studentDto.getAddressDTO(), String.class);


        return student.getStudentId();
    }
}
