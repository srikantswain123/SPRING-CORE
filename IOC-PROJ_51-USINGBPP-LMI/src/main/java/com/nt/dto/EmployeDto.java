package com.nt.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.bo.CommonProperty;
@Component("empDto")
@Scope("prototype")
public class EmployeDto extends CommonProperty {
	private String comp;
	private Float totalSallary;
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public Float getTotalSallary() {
		return totalSallary;
	}
	public void setTotalSallary(Float totalSallary) {
		this.totalSallary = totalSallary;
	}
	@Override
	public String toString() {
		return "EmployeDto [comp=" + comp + ", totalSallary=" + totalSallary + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
