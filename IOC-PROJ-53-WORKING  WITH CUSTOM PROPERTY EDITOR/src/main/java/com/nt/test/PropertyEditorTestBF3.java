package com.nt.test;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.LoanAmtIntrestCalc;

public class PropertyEditorTestBF3 {

	public static void main(String[] args) {
		CustomEditorConfigurer cec=null;
		LoanAmtIntrestCalc calc=null;
       DefaultListableBeanFactory factory=null;
       XmlBeanDefinitionReader reader=null;
       //create IOC container
       factory=new DefaultListableBeanFactory();
       reader=new XmlBeanDefinitionReader(factory);
      
       reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
       
       cec=factory.getBean(CustomEditorConfigurer.class);
       cec.postProcessBeanFactory(factory);
       calc=factory.getBean("calc",LoanAmtIntrestCalc.class);
       System.out.println(calc.amtCalc());
       
	}    
       
	

}
