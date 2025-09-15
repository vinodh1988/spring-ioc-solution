package com.iocapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iocapp.system.Task;


@SpringBootApplication
public class FirstIocSolutionApplication {

	public static void main(String[] args) {
		ApplicationContext ac =
				SpringApplication.run(FirstIocSolutionApplication.class, args);
		
		//System.out.println(ac.getDisplayName());
		
	  Task t= (Task)	ac.getBean("copy");
	  t.execute();
	  t=(Task)ac.getBean("write");
	  t.execute();
	}

}
