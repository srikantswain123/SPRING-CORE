package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainControler;
import com.nt.service.CustomerMgmtService;
import com.nt.vo.CustomerVO;

public class CustomerDITest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
	factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	Scanner scn=null;
	scn=new Scanner(System.in);
	CustomerVO vo=null;
	vo=new CustomerVO();
	System.out.println("Enter customer Name");
	vo.setCname(scn.nextLine());
	
	System.out.println("Enter customer Address");
	vo.setCadd(scn.nextLine());
	System.out.println("Enter Principle Amount");
	vo.setPamt(scn.nextLine());
	System.out.println("Enter Rate of intrest");
	vo.setRtintrest(scn.nextLine());
	System.out.println("Enter year");
	vo.setTime(scn.nextLine());
	MainControler controler=factory.getBean("mco",MainControler.class);
	try {
	System.out.println(controler.register(vo));
	}catch(Exception e) {
		e.printStackTrace();
	}
	
		
	}

}
