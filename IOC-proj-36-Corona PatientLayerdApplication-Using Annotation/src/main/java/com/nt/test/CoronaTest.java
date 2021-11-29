package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controler.MainControler;
import com.nt.vo.CoronaVo;

public class CoronaTest {
	

	public static void main(String[] args) {
		ApplicationContext parentCtx=null,childCtx=null;
		List<CoronaVo> listVo=null;
		MainControler controler=null;
		try {
		//create Parent ApplicationContainer
		parentCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//create Child ApplicationContainer
		childCtx=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation-beans.xml"},parentCtx);
		controler=parentCtx.getBean("mco",MainControler.class);
		
		listVo=controler.getDetails();
		//print each record of politician
		listVo.forEach(System.out::println);
		
		
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
	}//main

}//class
