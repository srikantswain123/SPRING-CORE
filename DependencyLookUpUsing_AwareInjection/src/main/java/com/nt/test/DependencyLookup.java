package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class DependencyLookup {

	public static void main(String[] args) {
		System.out.println("1 st container");
	     Vehicle vehicle=null;
		
		ApplicationContext ctx=null;
		//create Applicaion Context Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		vehicle=ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("hyd", "warangal");
	}

}
