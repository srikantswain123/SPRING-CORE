package com.nt.customEditor;

import java.beans.PropertyEditorSupport;

import com.nt.beans.LoanAmtDetails;

public class LoanAmtEditor extends PropertyEditorSupport {

	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float amt=0.0f;
		float rate=0.0f;
		float time=0.0f;
		LoanAmtDetails details=null;
		amt=Float.parseFloat(text.substring(0, 6));
		rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		time=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		details=new LoanAmtDetails();
		details.setpAmt(amt);
		details.setRate(rate);
		details.setTime(time);
		setValue(details);
		
	}
}
