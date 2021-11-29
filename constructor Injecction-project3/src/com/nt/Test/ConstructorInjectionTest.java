package com.nt.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		
		WishMessageGenerator generator=null;
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		generator=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator.WishMessageGenerator("raja"));
	
		
	}

}
