package com.iocapp.system;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;



@Component("da")
public class DataAnalysis implements Activity,InitializingBean {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Data analysis being done");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DA logic");
	}


}
