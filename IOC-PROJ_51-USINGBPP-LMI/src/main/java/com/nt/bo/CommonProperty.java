package com.nt.bo;

import java.time.LocalDateTime;

public abstract class CommonProperty {
	private Integer no;
	private String name;
	private LocalDateTime doj;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getDoj() {
		return doj;
	}
	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "CommonProperty [no=" + no + ", name=" + name + ", doj=" + doj + "]";
	}
	

}
