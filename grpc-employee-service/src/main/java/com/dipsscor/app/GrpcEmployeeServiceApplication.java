package com.dipsscor.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dipsscor.*")
public class GrpcEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcEmployeeServiceApplication.class, args);
	}

}
