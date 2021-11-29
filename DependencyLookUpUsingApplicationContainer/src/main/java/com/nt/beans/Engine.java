package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("engg")
public class Engine {
	
	public Engine() {
		System.out.println("Engine Using Zero Param constructor");
	}
	public void start() {
		System.out.println("Engine starts");
	}
	public void stop() {
		System.out.println("Engine Stop");
	}

}
