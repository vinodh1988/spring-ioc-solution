package com.iocapp.system;


import org.springframework.stereotype.Component;

@Component("da")
public class DataAnalysis implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Data analysis being done");
	}

}
