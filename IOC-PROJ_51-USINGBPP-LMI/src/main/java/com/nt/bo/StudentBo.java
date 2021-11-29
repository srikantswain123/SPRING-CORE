package com.nt.bo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stuBo")
@Scope("prototype")
public class StudentBo extends CommonProperty {
	private String address;
	private Integer totalMark;
	private Integer FullMark;
	
	public StudentBo() {
    System.out.println("StudentBo::using zero Param Constructor)");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(Integer totalMark) {
		this.totalMark = totalMark;
	}
	public Integer getFullMark() {
		return FullMark;
	}
	public void setFullMark(Integer fullMark) {
		FullMark = fullMark;
	}
	@Override
	public String toString() {
		return "StudentBo [address=" + address + ", totalMark=" + totalMark + ", FullMark=" + FullMark + ", toString()="
				+ super.toString() + "]";
	}
	
}
