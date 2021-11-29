package com.nt.beans;

public class DHL implements Courier {

	
	public DHL() {
		System.out.println("DHL using Zero Param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL Courier");
		
		return "DHL Courier will deliver  order id :: "+oid +" order  products";
	}

}
