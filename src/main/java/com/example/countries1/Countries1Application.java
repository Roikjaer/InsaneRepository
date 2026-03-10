package com.example.countries1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Countries1Application {

	public static void main(String[] args) {
		SpringApplication.run(Countries1Application.class, args);
	}

}
