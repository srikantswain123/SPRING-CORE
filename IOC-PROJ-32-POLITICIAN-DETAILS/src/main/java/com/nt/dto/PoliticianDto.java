package com.nt.dto;

import java.io.Serializable;

public class PoliticianDto implements Serializable {
	private Integer sino;
	private String name;
	private Integer age;
	private String addrs;
	private String party;
	private String desg;
	public Integer getSino() {
		return sino;
	}
	public void setSino(Integer sino) {
		this.sino = sino;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "PoliticianDto [sino=" + sino + ", name=" + name + ", age=" + age + ", addrs=" + addrs + ", party="
				+ party + ", desg=" + desg + "]";
	}
	

}
