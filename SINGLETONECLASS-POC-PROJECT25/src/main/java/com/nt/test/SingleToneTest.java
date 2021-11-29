package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.std.SingleTone;

public class SingleToneTest {

	public static void main(String[] args) {
    ApplicationContext ctx=null;
    SingleTone si=null;
  //  ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
    ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    si=ctx.getBean("si",SingleTone.class);
    si=ctx.getBean("si",SingleTone.class);
    si.getInstance();
    
    
    
  
    
   
    
		
		
	}

}
