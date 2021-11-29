package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.WishMessage;

@SpringBootApplication
public class IocProj60SpringBootFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessage gen=null;
		//create contaier
		
		ctx=SpringApplication.run(IocProj60SpringBootFirstAppApplication.class, args);
		gen=ctx.getBean("wmg",WishMessage.class);
		System.out.println(gen.generateWishMessage("raja"));
	}

}
