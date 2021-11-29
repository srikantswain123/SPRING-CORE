package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	
	public WishMessageGenerator(Date date) {
		
		this.date = date;
	}


	public String WishMessageGenerator(String user) {
		int hour=0;
		hour=date.getHours();
		if(hour<12)
			return "good morning  "+user+date;
		else if(hour<16)
			return "good afternoon  "+user;
		else if(hour<20)
			return "good evening  "+user;
		else
			return "good night  "+user;
	}

}
