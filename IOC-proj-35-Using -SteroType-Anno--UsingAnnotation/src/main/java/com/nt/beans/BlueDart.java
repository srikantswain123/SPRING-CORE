package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bdt")
@Lazy
public class BlueDart implements Courier {
	

	public BlueDart() {
		System.out.println("BLUE dart Using Zero Param Constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("using BlueDart courier");
		
		return "BlueDArt Courier will deliver  order id :: "+oid +" order  products";
	}

}
