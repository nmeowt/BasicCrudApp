package com.nmt.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nmt.crud")
public class BasicCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicCrudAppApplication.class, args);
	}

}
