package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware{
	private String beanid;
	private ApplicationContext ctx;
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	public WebContainer() {
		System.out.println("WebContainer::using zero Param constructor");
	}
		public   void  processRequest(String data) {
		RequestHandler rh=null;
		rh=ctx.getBean(beanid,RequestHandler.class);
		System.out.println("WebContainer is processing request with data::"+data+ "by giving it to handler");
		rh.handleRequest(data);
	}
		


}
