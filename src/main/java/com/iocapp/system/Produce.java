package com.iocapp.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Produce implements Action {

	@Override
	public void implement() {
		// TODO Auto-generated method stub
         System.out.println("Producing the product");
	}

}
