package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	

	public Flipkart(Courier courier) {
		this.courier=courier;
      System.out.println("Flip kart Constructor");
	}
	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart Zero param constructor");
	}
	public String shopping(String items[],float amt[]) {
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		for(float amount:amt)
			billAmt+=amount;
		oid=new Random().nextInt(10000);
		msg=courier.deliver(oid);
		return Arrays.toString(items)+" are purchased having price "+Arrays.toString(amt)+" With billAmount "+billAmt+"--"+msg;
	}
	

}
