package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	@Autowired
	@Qualifier("bdt")
	private Courier courier;
	@Autowired
	private static Date date;
	
	public Flipkart() {
		System.out.println("Flipkart Using Zero param constructor");
	}

	
	public String shopping(String items[], float amt[]) {
		System.out.println("Shooping At::"+date);
		float billAmt = 0.0f;
		int oid = 0;
		String msg = null;
		for (float amount : amt)
			billAmt += amount;
		oid = new Random().nextInt(10000);
		msg = courier.deliver(oid);
		return Arrays.toString(items) + " are purchased having price " + Arrays.toString(amt) + " With billAmount "
				+ billAmt + "--" + msg;
	}

}
