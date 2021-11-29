package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component("voter")
public class Voter  {
	@Setter
	@Getter
	@Value("raja")
	private String name;
	@Setter
	@Value("45")
	private int age;
	@Setter
	private Date dov; 

	boolean flag=false;
	public String checkEligibility() {
		System.out.println("Voter.checkEligibility()");
		if(age>=18)
			return "Mr/Miss/Mrs."+name+" You are eligible for voting::"+dov;
		else
			return "Mr/Miss/Mrs."+name+" You are not eligible for voting::"+dov;

	}
        @PreDestroy
	public void destroy() {
		System.out.println("Voter.destroy()");
		name=null;
		age=0;
		dov=null;

	}

       @PostConstruct
	public void init(){
		System.out.println("Voter.init()");		
		dov=new Date();//initialized left over properties
		if(name==null)//verifying inject property coreect or not
			throw new IllegalArgumentException("name should not be nullify");
		if(age<0)
			age=age*-1;//correcting the injected values bean post processing
		if(age>100)
			throw new IllegalArgumentException("age must be less than 100");
	}

}
