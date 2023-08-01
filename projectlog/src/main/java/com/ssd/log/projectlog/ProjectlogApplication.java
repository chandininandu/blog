package com.ssd.log.projectlog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectlogApplication.class, args);
		
		System.out.println("helloooo");
		

	}


    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
