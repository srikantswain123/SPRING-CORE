package com.nt.vo;

public class CelebrityVo {
	private String sino;
	private String name;
	private String address;
	private String age;
	private String spouseName;
	private String childrens;
	public String getSino() {
		return sino;
	}
	public void setSino(String sino) {
		this.sino = sino;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getChildrens() {
		return childrens;
	}
	public void setChildrens(String childrens) {
		this.childrens = childrens;
	}
	@Override
	public String toString() {
		return "CelebrityVo [sino=" + sino + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", spouseName=" + spouseName + ", childrens=" + childrens + "]";
	}
	

}
