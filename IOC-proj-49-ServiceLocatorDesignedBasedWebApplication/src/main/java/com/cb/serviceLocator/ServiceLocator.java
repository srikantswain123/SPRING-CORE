package com.cb.serviceLocator;

import org.springframework.beans.factory.FactoryBean;

import com.cb.extcomp.Iiplcomp;
import com.cb.extcomp.IplCompImpl;

public class ServiceLocator implements FactoryBean<Iiplcomp> {
	private Iiplcomp extcomp;
	

	public ServiceLocator() {
		extcomp=new IplCompImpl();
	}

	@Override
	public Iiplcomp getObject() throws Exception {
		// TODO Auto-generated method stub
		return extcomp;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Iiplcomp.class;
	}
	
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
