package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class WebContainer {
	
	
	//create dependent class as return also an abstract becoz here container automatioc create sub class target class like as in meemory class
	@Lookup("handler")
	public abstract RequestHandler createRequest();
	
	
	public WebContainer() {
		System.out.println("WebContainer::using zero Param constructor");
	}
		public   void  processRequest(String data) {
		RequestHandler rh=null;
		rh=createRequest();
		System.out.println("WebContainer is processing request with data::"+data+ "by giving it to handler");
		rh.handleRequest(data);
	}
		


}
