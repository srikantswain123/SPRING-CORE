package com.nt.bo;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("empBo")
@Scope("prototype")
public class EmployeBo extends CommonProperty {
	private String companyNme;
	private Float netSallary;
	private Float grosSallary;
	
	public EmployeBo() {
		System.out.println("EmployeBo::using Zero Parm Constructor");
	}

	public String getCompanyNme() {
		return companyNme;
	}

	public void setCompanyNme(String companyNme) {
		this.companyNme = companyNme;
	}

	public Float getNetSallary() {
		return netSallary;
	}

	public void setNetSallary(Float netSallary) {
		this.netSallary = netSallary;
	}

	public Float getGrosSallary() {
		return grosSallary;
	}

	public void setGrosSallary(Float grosSallary) {
		this.grosSallary = grosSallary;
	}

	@Override
	public String toString() {
		return "EmployeBo [companyNme=" + companyNme + ", netSallary=" + netSallary + ", grosSallary=" + grosSallary
				+ ", toString()=" + super.toString() + "]";
	}


	
	 
	
	

}
