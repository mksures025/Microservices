package com.te.studentservice.dto;

import com.te.addressapp.dto.AddressDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class StudentDTO {
    private String studentId;
    private String studentName;
    private String bloodGroup;
    private String gender;

    private AddressDTO addressDTO;
}
