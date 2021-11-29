package com.nt.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controler.MainControler;
import com.nt.vo.CelebrityVo;

public class CelebrityTest {

	public static void main(String[] args) {
		
		List<CelebrityVo> vo = new ArrayList();
		MainControler mco = null;
		// create Parent Class Application Container
		ApplicationContext parentCtx = null;
		// create child class ApplicaionContainer
		ApplicationContext childCtx = null;
		try {
			
			// create parent container
			parentCtx = new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
			// create child container and pass child container for nested container
			childCtx = new ClassPathXmlApplicationContext(new String[] { "com/nt/cfgs/presentation-beans.xml" },
					parentCtx);

			mco = childCtx.getBean("mco", MainControler.class);
			
			vo = mco.getDetails();
			// print the data
			//vo.forEach(vo1->System.out.println(vo1));
			vo.forEach(System.out::println);

		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch

	}// main

}// class
