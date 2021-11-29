package com.nt.target;

public class BankIntrestMangement {
	
	
	public float compoundIntrest(float pAmt,float rate,float time) {
		System.out.println("BankIntrestMangement.compoundIntrest()");
		return (float)(pAmt*Math.pow(1+rate/100, time))-pAmt;
	}

}
