package com.iocapp.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Prepare implements Action {

	@Override
	public void implement() {
		// TODO Auto-generated method stub
         System.out.println("Preparing for the production");
	}

}
