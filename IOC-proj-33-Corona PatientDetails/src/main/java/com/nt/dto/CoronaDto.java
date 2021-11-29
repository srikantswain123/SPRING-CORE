package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class CoronaDto implements Serializable {
	private Integer sino;
	private  Integer patientId;
	private String PatientName;
	private Integer age;
	private String address;
	private Integer Staying_days;
	private Integer totalAmt;

}
