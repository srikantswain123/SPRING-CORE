package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::zero param constructor");
	}

    @Autowired
	private LocalDateTime date;
	
	
	public String generateWishMessage(String user) {
		int hour=0;
		hour=date.getHour();
		if(hour<12)
			return "good morning::"+user;
		else if(hour<16)
			return "good afternoon::"+user;
		else if(hour<20)
			return "good evening ::"+user;
		else
			return "good night::"+user;
		
	}

}//class
