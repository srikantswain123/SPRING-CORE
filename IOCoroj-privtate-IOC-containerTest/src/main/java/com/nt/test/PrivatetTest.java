package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Example;

public class PrivatetTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Example ex=null;
		Object se=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		ex=factory.getBean("ex",Example.class);
		System.out.println(ex);
		se=factory.getBean("sa",Object.class);
		System.out.println(se);

	}

}
