package com.nt.beans;

public class LoanAmtIntrestCalc {
	private LoanAmtDetails details;

	public LoanAmtIntrestCalc(LoanAmtDetails details) {
		this.details = details;
	}
	
	public float amtCalc() {
		return (details.getpAmt()*details.getRate()*details.getTime())/100.0f;
	}
	

}
