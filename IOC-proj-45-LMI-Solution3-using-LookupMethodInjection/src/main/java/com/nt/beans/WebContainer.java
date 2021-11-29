package com.nt.beans;

public interface  WebContainer {
	
	
	//create dependent class as return also an abstract becoz here container automatioc create sub class target class like as in meemory class
    RequestHandler createRequest();
	
	
	
		default   void  processRequest(String data) {
		RequestHandler rh=null;
		rh=createRequest();
		System.out.println("WebContainer is processing request with data::"+data+ "by giving it to handler");
		rh.handleRequest(data);
	}
		


}
