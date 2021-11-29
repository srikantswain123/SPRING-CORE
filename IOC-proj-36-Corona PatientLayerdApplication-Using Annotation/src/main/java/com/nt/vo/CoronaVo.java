package com.nt.vo;

public class CoronaVo {
	private String sino;
	private  String patientId;
	private String PatientName;
	private String age;
	private String address;
	private String Staying_days;
	private String totalAmt;
	public String getSino() {
		return sino;
	}
	public void setSino(String sino) {
		this.sino = sino;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStaying_days() {
		return Staying_days;
	}
	public void setStaying_days(String staying_days) {
		Staying_days = staying_days;
	}
	public String getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	@Override
	public String toString() {
		return "CoronaVo [sino=" + sino + ", patientId=" + patientId + ", PatientName=" + PatientName + ", age=" + age
				+ ", address=" + address + ", Staying_days=" + Staying_days + ", totalAmt=" + totalAmt + "]";
	}

}
