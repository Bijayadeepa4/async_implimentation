package com.crudOperation.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class AsyncDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(AsyncDemo1Application.class, args);
	}

}
