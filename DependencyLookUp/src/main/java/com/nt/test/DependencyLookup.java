package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Vehicle;

public class DependencyLookup {

	public static void main(String[] args) {
		System.out.println("1 st container");
	     Vehicle vehicle=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		final String s1=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		vehicle=factory.getBean("vehicle",Vehicle.class);
		vehicle.journey("hyd", "warangal");
	}

}
