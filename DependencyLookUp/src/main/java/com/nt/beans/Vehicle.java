package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehicle {
	private String beainId;
	
	
	
	
	
	public Vehicle(String beainId) {
		this.beainId = beainId;
	}
	
	
	public void journey(String src,String dest) {
		System.out.println("2nd Container");
		Engine eng=null;
		String src1="Start journey from::"+src;
		String dest1="now u rach ur destination:"+dest;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		eng=factory.getBean(beainId,Engine.class);
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
