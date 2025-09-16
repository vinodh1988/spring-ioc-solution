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
	/*	
	  Task t= (Task)	ac.getBean("copy");
	  Task t1= (Task)	ac.getBean("copy");
	  Task t2= (Task)	ac.getBean("copy");
	  t.execute();
	  System.out.println(t.hashCode());
	  System.out.println(t1.hashCode());
	  System.out.println(t2.hashCode());
	  t=(Task)ac.getBean("write");
	  t1=(Task)ac.getBean("write");
	  t2=(Task)ac.getBean("write");
	  t.execute();
	  
	  System.out.println(t.hashCode());
	  System.out.println(t1.hashCode());
	  System.out.println(t2.hashCode());*/
	}

}
