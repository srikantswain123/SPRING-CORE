package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Courier;
import com.nt.beans.DTDC;

public class ApplicationContextt {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Courier courier=null;
		courier=ctx.getBean("dtdc",DTDC.class);
		courier=ctx.getBean("dtdc",DTDC.class);
		
		

	}

}
