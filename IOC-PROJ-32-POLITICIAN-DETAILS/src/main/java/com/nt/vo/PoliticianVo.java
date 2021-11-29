package com.nt.vo;

public class PoliticianVo {
	private String sino;
	private String name;
	private String age;
	private String addrs;
	private String party;
	private String desg;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
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
		return "PoliticianVo [sino=" + sino + ", name=" + name + ", age=" + age + ", addrs=" + addrs + ", party="
				+ party + ", desg=" + desg + "]";
	}
	

}
