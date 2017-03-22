package com.syntel.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class HackthonMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackthonMicroserviceApplication.class, args);
	}
}
