package com.nt.beans;

import java.time.LocalDate;

public class Reminder {
	private LocalDate date;

	public Reminder(LocalDate date) {
		this.date = date;
	}
	public String reminder() {
		LocalDate sysdate=null;
		sysdate=LocalDate.now();
		if(sysdate.isEqual(date)) {
			return "Reminder About atten to board Metting";
		}else {
			return "today no meeting take rest"; 
		}
		
		
	}
	

}
