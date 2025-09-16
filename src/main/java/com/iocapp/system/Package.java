package com.iocapp.system;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Package implements Action {

	@Override
	public void implement() {
		// TODO Auto-generated method stub
           System.out.println("Packaging the products");
	}

}
