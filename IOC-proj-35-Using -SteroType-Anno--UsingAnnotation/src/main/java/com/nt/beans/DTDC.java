package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Scope("prtotype")
public class DTDC implements Courier {

	
	public DTDC() {
		System.out.println("DTDC using Zero Param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC Courier");
		
		return "DTDC Courier will deliver  order id :: "+oid +" order  products";
	}

}
