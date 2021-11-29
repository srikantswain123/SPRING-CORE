package com.cb.serviceLocator;

import com.cb.extcomp.Iiplcomp;
import com.cb.extcomp.IplCompImpl;

public interface ServiceLocatorStaticFactroy {
 final static Iiplcomp extcomp=new IplCompImpl();
	
public static Iiplcomp getInstance() {
	return extcomp;
}
	

}
