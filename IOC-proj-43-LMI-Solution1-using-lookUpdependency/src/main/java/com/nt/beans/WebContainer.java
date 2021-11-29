package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanid;
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	public WebContainer() {
		System.out.println("WebContainer::using zero Param constructor");
	}
		public   void  processRequest(String data) {
		RequestHandler rh=null;
		ApplicationContext ctx=null;
		//create Extra IOc Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		rh=ctx.getBean(beanid,RequestHandler.class);
		System.out.println("WebContainer is processing request with data::"+data+ "by giving it to handler");
		rh.handleRequest(data);
	}


}
