package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonInfo;

public class PropertyEditorTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		PersonInfo info=null;
		info=ctx.getBean("info",PersonInfo.class);
		System.out.println(info);

	}

}
