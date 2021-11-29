package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class StartegyTestWithSpring {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		//create Ioc Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicatioContext.xml");
		
	Flipkart fkt=ctx.getBean("fkt",Flipkart.class);
	System.out.println(fkt.shopping(new String[] {"PPE","MASK","SANITIZER"},new float[] {100,300,400}));
	
	}

}
