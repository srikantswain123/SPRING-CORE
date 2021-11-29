package com.nt.beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessage {
	@Autowired
	private LocalTime time;
	
	
	public String generateWishMessage(String user) {
		int hour=time.getHour();
		if(hour<12)
			return "good morning::"+user;
		else if(hour<16)
			return "good afternoon::"+user;
		else if(hour<20)
			return "good evening::"+user;
		else
			return "good night::"+user;
	}

}
