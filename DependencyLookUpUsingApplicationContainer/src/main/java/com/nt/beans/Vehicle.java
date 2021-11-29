package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component("vehicle")
public class Vehicle {
	//@Value("engg")
	//private String beainId;
	
	
	
	
	
	
	//approach1
	/*public void journey(String src,String dest) {
		System.out.println("2nd Container");
		Engine eng=null;
		String src1="Start journey from::"+src;
		String dest1="now u rach ur destination:"+dest;
		ApplicationContext ctx=null;
		//create Ioc Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		eng=ctx.getBean(beainId,Engine.class);
		eng.start();
		fuel();
		System.out.println(src1);
		entertainment();
		horn();
		System.out.println(dest1);
		eng.stop();
	}*/
	//approach 2
	/*public void journey(String src,String dest,ApplicationContext ctx) {
		System.out.println("2nd Container");
		Engine eng=null;
		String src1="Start journey from::"+src;
		String dest1="now u rach ur destination:"+dest;
		//create Ioc Container
		eng=ctx.getBean(beainId,Engine.class);
		eng.start();
		fuel();
		System.out.println(src1);
		entertainment();
		horn();
		System.out.println(dest1);
		eng.stop();
	}*/
	
	













	//approach 3
	public void journey(String src,String dest,ApplicationContext ctx,String beanId) {
		System.out.println("2nd Container");
		Engine eng=null;
		String src1="Start journey from::"+src;
		String dest1="now u rach ur destination:"+dest;
		//create Ioc Container
		eng=ctx.getBean(beanId,Engine.class);
		eng.start();
		fuel();
		System.out.println(src1);
		entertainment();
		horn();
		System.out.println(dest1);
		eng.stop();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void entertainment() {
		System.out.println(" ON Music player for entertaining");
	}
	public void horn() {
		System.out.println("trafic area use Horn");
	}
	public void fuel() {
		System.out.println("Petrol tank  is 50 ltrs Capacity plz fillup for long drive");
	}

}
