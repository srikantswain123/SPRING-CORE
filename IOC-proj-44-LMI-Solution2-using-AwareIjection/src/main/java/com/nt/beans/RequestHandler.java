package com.nt.beans;

public class RequestHandler {
	public static int count;

	public RequestHandler() {
		count++;
		System.out.println("Request Handler Using Zero param constructor"+count);
	}
	public void handleRequest(String data) {
		System.out.println("handling request with "+data +"using the object ::"+count);
	}
	
	

}
