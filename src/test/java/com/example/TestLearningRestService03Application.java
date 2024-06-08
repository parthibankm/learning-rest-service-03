package com.example;

import org.springframework.boot.SpringApplication;

public class TestLearningRestService03Application {

	public static void main(String[] args) {
		SpringApplication.from(LearningRestService03Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
