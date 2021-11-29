package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Reminder;

public class BeanFactoyTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Reminder rm=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		rm=ctx.getBean("remind",Reminder.class);
		System.out.println(rm.reminder());
		((AbstractApplicationContext) ctx).close();

	}

}
