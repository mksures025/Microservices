package com.te.studentservice.studentconfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StudentConfiguration {


    @Bean
    public ModelMapper modelMapper(){

        return new ModelMapper();
    }

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }


}
