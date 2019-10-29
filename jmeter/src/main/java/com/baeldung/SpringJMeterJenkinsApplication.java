package com.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.baeldung.repository.StudentDataRestRepository;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringJMeterJenkinsApplication {
	
	@Autowired
	StudentDataRestRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJMeterJenkinsApplication.class, args);
	}
}
