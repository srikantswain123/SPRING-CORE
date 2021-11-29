package com.nt.beans;

import java.util.Date;
import java.util.List;

public class CollegeCollection {
	private List<String> student;
	private List<Date> sysdate;

	public void setStudent(List<String> student) {
		this.student = student;
	}
	

	public void setSysdate(List<Date> sysdate) {
		this.sysdate = sysdate;
	}


	@Override
	public String toString() {
		return "CollegeCollection Name [student=" + student + ", Joining date=" + sysdate + "]";
	}


	
	
	
	

}
