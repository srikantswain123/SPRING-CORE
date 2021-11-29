package com.nt.beans;

public class Bike {
	private String bikeName;
	private int bikeNo;
	private String regno;
	private String owner;
	private String color;
	private String engno;
	private String model;
	
	public Bike(String bikeName, int bikeNo, String regno, String owner, String color, String engno, String model) {
		this.bikeName = bikeName;
		this.bikeNo = bikeNo;
		this.regno = regno;
		this.owner = owner;
		this.color = color;
		this.engno = engno;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", bikeNo=" + bikeNo + ", regno=" + regno + ", owner=" + owner
				+ ", color=" + color + ", engno=" + engno + ", model=" + model + "]";
	}
	
	
	

}
