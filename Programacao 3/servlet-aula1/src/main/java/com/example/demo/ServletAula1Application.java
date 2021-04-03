package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletAula1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServletAula1Application.class, args);
	}

}
