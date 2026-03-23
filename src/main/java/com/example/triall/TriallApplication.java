package com.example.triall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TriallApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TriallApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TriallApplication.class, args);
		System.out.println("Application is RUNNING");
	}



}
