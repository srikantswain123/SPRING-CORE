package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class PocTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		ArrayAndCollectionInjectionTest test=null;
		test=factory.getBean("marks",ArrayAndCollectionInjectionTest.class);
		System.out.println(test);
		System.out.println("---------------------------");
		CollegeCollection cl=factory.getBean("stu",CollegeCollection.class);
		System.out.println(cl);
		
	}

}
