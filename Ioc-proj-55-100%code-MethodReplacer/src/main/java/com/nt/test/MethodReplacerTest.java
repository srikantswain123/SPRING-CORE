package com.nt.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.target.BankIntrestMangement;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankIntrestMangement mgmt=null;
		//create container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		mgmt=ctx.getBean("compound",BankIntrestMangement.class);
		//invoke method
		System.out.println(mgmt.compoundIntrest(100000,2, 12));
		

	}

}
