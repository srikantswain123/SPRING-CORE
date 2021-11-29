package com.nt.bo;

public class CoronaBo {
	
	private  Integer patientId;
	private String PatientName;
	private Integer age;
	private String Address;
	private Integer Staying_days;
	private Integer totalAmt;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getStaying_days() {
		return Staying_days;
	}
	public void setStaying_days(Integer staying_days) {
		Staying_days = staying_days;
	}
	public Integer getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Integer totalAmt) {
		this.totalAmt = totalAmt;
	}
	@Override
	public String toString() {
		return "CoronaBo [patientId=" + patientId + ", PatientName=" + PatientName + ", age=" + age + ", Address="
				+ Address + ", Staying_days=" + Staying_days + ", totalAmt=" + totalAmt + "]";
	}
	

}
