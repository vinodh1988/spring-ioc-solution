package com.iocapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FirstIocSolutionApplication {

	public static void main(String[] args) {
		ApplicationContext ac =
				SpringApplication.run(FirstIocSolutionApplication.class, args);
		
		System.out.println(ac.getDisplayName());
	}

}
