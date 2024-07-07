package com.te.studentservice.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SuccessResponse {

    private String message;
    private Object data;
    private HttpStatus status;
    private LocalDateTime timeStamp;

}
