package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class SimpleIntrestReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("SimpleIntrestReplacer.reimplement()");
		float pamt=0.0f;
		float rate=0.0f;
		float time=0.0f;
		
		pamt=(float) args[0];
		rate=(float) args[1];
		time=(float) args[2];
		
		
		
		return pamt*rate*time/100;
	}

	
}
