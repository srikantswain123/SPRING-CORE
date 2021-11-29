package com.nt.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle resource=null;
		locale=new Locale(args[0],args[1]);
		resource=ResourceBundle.getBundle("com/nt/commons/App",locale);
		System.out.println(resource.getString("cap1.button")+"  "+resource.getString("cap2.button")+"  "+resource.getString("cap3.button"));
		
		

	}

}
