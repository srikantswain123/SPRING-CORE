package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Voter;

public class LIfeCycleTestUsingApplicationContainer {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Voter voter=null;
		//create Application Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		voter=ctx.getBean("voter", Voter.class);
		System.out.println(voter.checkEligibility());
		
		
		((AbstractApplicationContext) ctx).close();

	}

}
