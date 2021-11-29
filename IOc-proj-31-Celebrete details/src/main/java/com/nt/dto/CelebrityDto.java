package com.nt.dto;

import java.io.Serializable;

public class CelebrityDto implements Serializable {
	private Integer sno;
	private String name;
	private String address;
	private Integer age;
	private String spouseName;
	private String childrens;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
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
		return "CelebrityDto [sno=" + sno + ", name=" + name + ", address=" + address + ", age=" + age + ", spouseName="
				+ spouseName + ", childrens=" + childrens + "]";
	}
	

}
