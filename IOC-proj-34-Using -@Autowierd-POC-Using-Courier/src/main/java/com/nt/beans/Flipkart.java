package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	private Courier courier;
	private Date sysDate;

	public Flipkart() {
		System.out.println("Flipkart Using Zero param constructor");
	}

	@Autowired(required = false)
	public Flipkart(@Qualifier("bdt") Courier courier) {
		System.out.println("Using 1 Parameterized Constructor");
		this.courier = courier;

	}

	@Autowired(required = false)
	public Flipkart(@Qualifier("dhl") Courier courier, Date sysDate) {
		this.sysDate = sysDate;
		System.out.println("Using 2 Parameterized Constructor");
		this.courier = courier;

	}

	/*
	 * @Autowired
	 * 
	 * @Qualifier("dtdc") public void assign(Courier courier) {
	 * System.out.println("Assign courier"); this.courier=courier; }
	 * 
	 * @Autowired
	 * 
	 * @Qualifier("fFlight") public void setCourier(Courier courier) {
	 * System.out.println("Set Courier"); this.courier = courier;
	 * 
	 * }
	 */

	@Autowired
	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}

	public String shopping(String items[], float amt[]) {
		System.out.println("Shooping At::" + sysDate);
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
