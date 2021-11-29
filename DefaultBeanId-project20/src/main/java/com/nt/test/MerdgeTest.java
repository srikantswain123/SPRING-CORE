package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnggCourse;

public class MerdgeTest {

	public static void main(String[] args) {
		EnggCourse firstYear=null;
     DefaultListableBeanFactory factory=null;
     XmlBeanDefinitionReader reader=null;
     factory=new DefaultListableBeanFactory();
     reader=new XmlBeanDefinitionReader(factory);
     reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
     firstYear=factory.getBean("com.nt.beans.EnggCourse#2",EnggCourse.class);
     System.out.println(firstYear);
	}

}
