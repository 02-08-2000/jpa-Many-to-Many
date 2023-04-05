package com.example.jpaManytoMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.example.JpaManytoMany")
public class JpaManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyApplication.class, args);
	}

}
