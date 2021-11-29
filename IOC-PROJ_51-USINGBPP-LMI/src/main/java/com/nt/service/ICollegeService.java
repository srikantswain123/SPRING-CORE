package com.nt.service;

import com.nt.dto.EmployeDto;
import com.nt.dto.StudentDto;

public interface ICollegeService {
	
	public String getStudentDetails(StudentDto dto);
	public String getEmployeDetails(EmployeDto dto);

}
