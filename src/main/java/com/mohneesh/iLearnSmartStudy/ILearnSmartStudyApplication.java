package com.mohneesh.iLearnSmartStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ILearnSmartStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ILearnSmartStudyApplication.class, args);
	}

}
