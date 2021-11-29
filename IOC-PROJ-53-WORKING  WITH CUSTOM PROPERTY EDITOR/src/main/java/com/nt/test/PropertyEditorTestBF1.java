package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.LoanAmtDetails;
import com.nt.beans.LoanAmtIntrestCalc;
import com.nt.customEditor.LoanAmtEditor;

public class PropertyEditorTestBF1 {

	public static void main(String[] args) {
		LoanAmtIntrestCalc calc=null;
       DefaultListableBeanFactory factory=null;
       XmlBeanDefinitionReader reader=null;
       //create IOC container
       factory=new DefaultListableBeanFactory();
       reader=new XmlBeanDefinitionReader(factory);
       factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {
		
		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			registry.registerCustomEditor(LoanAmtDetails.class, new LoanAmtEditor());
			
		}
	});
       reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
       calc=factory.getBean("calc",LoanAmtIntrestCalc.class);
       System.out.println(calc.amtCalc());
       
	}    
       
	

}
