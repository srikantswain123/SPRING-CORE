package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controler.MainControler;
import com.nt.vo.PatientVO;

public class RealTimeDITest1 {

	public static void main(String[] args) {
		Scanner scn=null;
		PatientVO vo=null;
		DefaultListableBeanFactory factory=null;
		factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext1.xml");
		MainControler controler=factory.getBean("mco",MainControler.class);
		scn=new Scanner(System.in);
		vo=new PatientVO();
		System.out.println("Enter Patient Name");
		vo.setPname(scn.next());
		System.out.println("Enter Patient Age");
		vo.setPage(scn.next());
		System.out.println("Enter Days");
		vo.setStay(scn.next());
		System.out.println("Enter Address");
		vo.setPaddr(scn.next());
		try {
			System.out.println(controler.Register(vo));
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
