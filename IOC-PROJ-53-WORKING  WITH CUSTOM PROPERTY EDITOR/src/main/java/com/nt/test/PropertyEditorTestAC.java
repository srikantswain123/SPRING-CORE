package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.LoanAmtIntrestCalc;

public class PropertyEditorTestAC {

	public static void main(String[] args) {
		LoanAmtIntrestCalc calc=null;
      ApplicationContext ctx=null;
      //create application container
      ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       calc=ctx.getBean("calc",LoanAmtIntrestCalc.class);
       System.out.println(calc.amtCalc());
       
	}    
       
	

}
