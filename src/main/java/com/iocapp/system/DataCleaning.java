package com.iocapp.system;


import org.springframework.stereotype.Component;

@Component("dc")
public class DataCleaning implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
            System.out.println("DataCleaning activity");
	}

}
