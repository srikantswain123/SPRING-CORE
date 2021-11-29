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
	
		
		//in this approach is good but some impact will be there also now 
		//we take extra container
		//we also enable lazy-init if we dont enable lazy-init then every time class is loading object also creating whic is bad pratice
		//to over come this problem goes to aware Inject IOC-proj-44-lmiSolutio2
		

	}

}
