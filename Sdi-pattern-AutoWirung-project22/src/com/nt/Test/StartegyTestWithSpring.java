package com.nt.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class StartegyTestWithSpring {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicatioContext.xml");
		
		
	Flipkart fkt=factory.getBean("fkt",Flipkart.class);
	System.out.println(fkt.shopping(new String[] {"PPE","MASK","SANITIZER"},new float[] {100,300,400}));
	
	
	
	
	}

}
