package com.nt.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.bo.CommonProperty;
@Component("stuDto")
@Scope("prototype")
public class StudentDto extends CommonProperty {
	private Integer m1;
	private Integer m2;
	private Integer m3;
	
	public StudentDto() {
       System.out.println("StudentDto::using Zero Param Constructor");
	}
	public Integer getM1() {
		return m1;
	}
	public void setM1(Integer m1) {
		this.m1 = m1;
	}
	public Integer getM2() {
		return m2;
	}
	public void setM2(Integer m2) {
		this.m2 = m2;
	}
	public Integer getM3() {
		return m3;
	}
	public void setM3(Integer m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "StudentDto [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", toString()=" + super.toString() + "]";
	}
	

}
