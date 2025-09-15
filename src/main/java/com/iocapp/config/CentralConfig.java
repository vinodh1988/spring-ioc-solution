package com.iocapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.iocapp.system.Copy;
import com.iocapp.system.Task;
import com.iocapp.system.Write;

@Configuration
public class CentralConfig {
	{
		System.out.println("CentralConfig instantiated");
	}
	
	@Bean("copy") //scope is singleton
	public Task copy() {
		return new Copy();
	}

	@Bean("write")
	@Scope("prototype")
	public Task write() {
		return new Write();
	}
}
