package com.nt.bpp;

import java.time.LocalDateTime;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.nt.bo.CommonProperty;
@Component
public class BeanProcesssing implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		  if(bean instanceof CommonProperty) {
			  ((CommonProperty) bean).setDoj(LocalDateTime.now());
			  
		  }
		  return bean;
	}

}
