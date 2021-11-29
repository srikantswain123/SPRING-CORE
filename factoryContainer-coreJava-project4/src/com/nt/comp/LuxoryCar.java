package com.nt.comp;

public class LuxoryCar implements Car {
  private Tyre tyre;
  
	public LuxoryCar(Tyre tyre) {
	
	this.tyre = tyre;
}

	@Override
	public void drive() {
		System.out.println("Driving Sports Car having "+tyre.roadGrip());

	}

}
