package com.nt.beans;

public class Bike {
	private String bikeName;
	private int bikeNo;
	private String regno;
	private String owner;
	private String color;
	private String engno;
	private String model;
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEngno(String engno) {
		this.engno = engno;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", bikeNo=" + bikeNo + ", regno=" + regno + ", owner=" + owner
				+ ", color=" + color + ", engno=" + engno + ", model=" + model + "]";
	}
	
	
	

}
