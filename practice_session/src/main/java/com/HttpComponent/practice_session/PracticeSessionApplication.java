package com.HttpComponent.practice_session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PracticeSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSessionApplication.class, args);
	}

}
