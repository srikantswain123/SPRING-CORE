package com.nt.NameSpaceTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employe;
import com.nt.beans.Student;

public class NameSpaceTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Employe e=null;
		Student s=null;
           ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
           e=ctx.getBean("emp",Employe.class);
           System.out.println(e);
           System.out.println("---------------------------------------------");
           s=ctx.getBean("stu", Student.class);
           System.out.println(s);
           
	}

}
