package com.nt.std;

public class SingleTone {
	private static SingleTone INSTANCE;

	private SingleTone() {
		System.out.println("Zero param constructor"+this.hashCode());
	}
	public static SingleTone getInstance() {
		if(INSTANCE==null) 
			INSTANCE=new SingleTone();
		
		return INSTANCE;
		
	}
	

}
