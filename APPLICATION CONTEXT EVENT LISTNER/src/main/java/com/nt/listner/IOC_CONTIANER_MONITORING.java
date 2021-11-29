package com.nt.listner;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOC_CONTIANER_MONITORING implements ApplicationListener {
   long start,end;
	public IOC_CONTIANER_MONITORING() {
     System.out.println("IOC listner Using Zero Param constructor");
	}
	
	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		
		if(e.toString().indexOf("ContextRefreshed")!=-1) {
			start=System.currentTimeMillis();
			System.out.println("Container Started Time="+new Date());
		}else if(e.toString().indexOf("ContextClosed")!=-1) {
			end=System.currentTimeMillis();
			System.out.println("Continaer Stoped time and closed Time="+new Date());
			System.out.println("Container Running Time="+(end-start)+" ms");
		}
		
		
	}
}
