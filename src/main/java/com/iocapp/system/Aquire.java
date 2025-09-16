package com.iocapp.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Aquire implements Action {

	@Override
	public void implement() {
		// TODO Auto-generated method stub
        System.out.println("Aquiring raw materials");
	}

}
