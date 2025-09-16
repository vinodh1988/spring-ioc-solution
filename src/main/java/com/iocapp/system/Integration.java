package com.iocapp.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Integration {

	{
	   System.out.println("Integration is instantiated");	
	}
	
	@Autowired
	@Qualifier("dc")
	Activity activity;
	
	@Autowired
	List<Action> actions;
	
	@PostConstruct
	public void doIt() {
		activity.perform();
		for(Action a:actions)
			a.implement();
	}
}
