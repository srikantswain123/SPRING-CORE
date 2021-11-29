package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LmiTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer con=null;
		//create ApplicationContainer
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		con=ctx.getBean("container",WebContainer.class);
		con.processRequest("hello");
		System.out.println("----------------");
		con.processRequest("hi");
		System.out.println("----------------");
		con.processRequest("123");
	
		

	}

}
