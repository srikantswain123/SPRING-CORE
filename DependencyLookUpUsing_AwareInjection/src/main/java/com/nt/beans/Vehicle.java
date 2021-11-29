package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("vehicle")

public class Vehicle implements ApplicationContextAware  {
	@Value("engg")
	private String beanId;
	ApplicationContext ctx=null;
	
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Vehicle.setApplicationContext()");
		this.ctx=ctx;
	}
	
	
	
	public Vehicle() {
	   System.out.println("Vehicle Using Zero param constructor");	
	}
	public void journey(String src,String dest) {
		System.out.println("2nd Container");
		Engine eng=null;
		String src1="Start journey from::"+src;
		String dest1="now u rach ur destination:"+dest;
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
