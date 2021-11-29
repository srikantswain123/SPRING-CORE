package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class Code100P_test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		WishMessageGenerator gen=null;
		//create con tainer
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		gen=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(gen.generateWishMessage("raja"));

	}

}
