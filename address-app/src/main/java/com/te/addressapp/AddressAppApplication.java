package com.te.addressapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AddressAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(AddressAppApplication.class, args);
	}


}
