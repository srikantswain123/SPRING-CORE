package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("fFlight")
public class FirstFlight implements Courier {

	
	public FirstFlight() {
		System.out.println("FirstFlight using Zero Param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight Courier");
		
		return "FirstFlight Courier will deliver  order id :: "+oid +" order  products";
	}

}
