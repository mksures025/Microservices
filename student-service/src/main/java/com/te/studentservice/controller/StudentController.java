package com.te.studentservice.controller;


import com.te.addressapp.dto.AddressDTO;
import com.te.studentservice.dto.StudentDTO;
import com.te.studentservice.response.SuccessResponse;
import com.te.studentservice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping(path ="student")
public class StudentController {

    private final StudentService studentService;
    @GetMapping(path="display")
    public StudentDTO display(){

        return StudentDTO.builder()
                .studentName("")
                .studentId("")
                .gender("")
                .bloodGroup("")
                .addressDTO(AddressDTO.builder().city("").state("").build())
                .build();
    }
    @PostMapping(path = "inserdata")
    public ResponseEntity<SuccessResponse> insertData(@RequestBody StudentDTO studentDto){


        String studentId=studentService.inserData(studentDto);

        return ResponseEntity.ok().body(SuccessResponse.builder()
                        .message("data inserted")
                        .data(studentId)
                        .status(HttpStatus.CREATED)
                        .timeStamp(LocalDateTime.now())
                .build());
    }
}
