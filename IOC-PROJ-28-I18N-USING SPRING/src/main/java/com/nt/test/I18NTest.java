package com.nt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTest {

	public static void main(String[] args) {
		String cap1=null,cap2=null,cap3=null,cap4=null;
		ApplicationContext ctx=null;
	   Locale locale=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		locale=new Locale(args[0],args[1]);
		cap1=ctx.getMessage("cap1.button",new String[] {"Student"}, locale);
		cap2=ctx.getMessage("cap2.button",null, locale);
		cap3=ctx.getMessage("cap3.button",null, locale);
		cap4=ctx.getMessage("cap4.button",null, locale);
//System.out.println(cap1+"  "+cap2+"  "+cap3+" "+cap4);


System.out.println(ctx.getMessage("cap2.button", null, new Locale("de","DE")));
System.out.println(ctx.getMessage("cap2.button", null, new Locale("hi","IN")));
System.out.println(ctx.getMessage("cap2.button", null, new Locale("fr","FR")));
	}

}
