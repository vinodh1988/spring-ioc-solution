package com.iocapp.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Integration {

	{
	   System.out.println("Integration is instantiated");	
	}
	
	@Autowired
	Activity activity;
	
	@PostConstruct
	public void doIt() {
		activity.perform();
	}
}
