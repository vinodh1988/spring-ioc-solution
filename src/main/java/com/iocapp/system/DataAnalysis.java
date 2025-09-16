package com.iocapp.system;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DataAnalysis implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Data analysis being done");
	}

}
