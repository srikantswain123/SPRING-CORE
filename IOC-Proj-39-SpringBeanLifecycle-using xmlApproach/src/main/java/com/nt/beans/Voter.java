package com.nt.beans;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Voter {
	@Setter
	@Getter
	private String name;
	@Setter
	private int age;
	@Setter
	private Date dov; 
	
	boolean flag=false;
	
	public void myInit() {
		System.out.println("Voter.myInit()");
		dov=new Date();//initialized left over properties
		if(name==null)//verifying inject property coreect or not
			throw new IllegalArgumentException("name should not be nullify");
		if(age<0)
			age=age*-1;//correcting the injected values bean post processing
		if(age>100)
			throw new IllegalArgumentException("age must be less than 100");
		
	
	}
	
	
	public String checkEligibility() {
		System.out.println("Voter.checkEligibility()");
		if(age>=18)
			return "Mr/Miss/Mrs."+name+" You are eligible for voting::"+dov;
		else
			return "Mr/Miss/Mrs."+name+" You are not eligible for voting::"+dov;
			
	}
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		name=null;
		age=0;
		dov=null;
	}

}
