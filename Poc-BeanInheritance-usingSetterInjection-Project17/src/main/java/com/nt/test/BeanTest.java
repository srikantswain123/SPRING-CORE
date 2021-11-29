package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Bike;

public class BeanTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bike rajiv=null,thakre=null,base=null;
		//create Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		rajiv=factory.getBean("rajiv",Bike.class);
		System.out.println(rajiv);
		System.out.println("------------------------");
		thakre=factory.getBean("thakre",Bike.class);
		System.out.println(thakre);
		System.out.println("-------------------");
		base=factory.getBean("base",Bike.class);
		System.out.println(base);
		
	}

}
