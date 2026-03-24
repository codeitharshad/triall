package com.example.triall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TriallApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TriallApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TriallApplication.class, args);
		System.out.println("Application is RUNNING");
	}

	// ✅ This is what you were missing
	@GetMapping("/")
	public String home() {
		return "Hello from Tomcat 🚀";
	}
}