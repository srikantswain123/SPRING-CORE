package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Voter;

public class LIfeCycleTestUsingBeanFactoryContainer {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Voter voter = null;
		// create Application Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		voter = factory.getBean("voter", Voter.class);
		System.out.println(voter.checkEligibility());
		factory.destroySingletons();

	}

}
