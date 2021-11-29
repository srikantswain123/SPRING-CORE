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
		con=ctx.getBean(WebContainer.class,"container");
		con.processRequest("hello");
		System.out.println("----------------");
		con.processRequest("hi");
		System.out.println("----------------");
		con.processRequest("123");
	
		
		
		//in this approach even though u take dependent scope as pototype scope and target class as single ton scope here dependent scope act as single ton scope which is very bad impact to application
		//for Solution goes to -IOC-proj-43 LMI Solution

	}

}
