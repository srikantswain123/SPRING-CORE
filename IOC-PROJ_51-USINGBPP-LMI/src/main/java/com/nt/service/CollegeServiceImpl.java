package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeBo;
import com.nt.bo.StudentBo;
import com.nt.dao.IEmployeDao;
import com.nt.dao.IStudentDao;
import com.nt.dto.EmployeDto;
import com.nt.dto.StudentDto;
@Service("service")
@Scope("singleton")
public abstract class CollegeServiceImpl implements ICollegeService {
	@Autowired
	private IEmployeDao edao;
	@Autowired
	private IStudentDao sdao;
	
	//fetch student Bo as Lmi
	@Lookup
	public abstract StudentBo fetchStuBo();
	//fetch student Bo as Lmi
	@Lookup
	public abstract EmployeBo fetchEmpBo();
	

	@Override
	public String getStudentDetails(StudentDto dto) {
		StudentBo bo=fetchStuBo();
		BeanUtils.copyProperties(dto, bo);
		  bo.setTotalMark(dto.getM1()+dto.getM2()+dto.getM3());
		  bo.setFullMark(600);
		int result=sdao.studentDetails(bo);
		return result==0?"Student Details not Recorded":"Student Details Enrolled";
	}

	@Override
	public String getEmployeDetails(EmployeDto dto) {
		Float netSallary=0.0f;
		Float grossSallary=0.0f;
		EmployeBo bo=fetchEmpBo();
		BeanUtils.copyProperties(dto, bo);
		
		netSallary=dto.getTotalSallary()+(dto.getTotalSallary()*0.4f);
		grossSallary=netSallary-(netSallary*0.2f);
		bo.setNetSallary(netSallary);
		bo.setGrosSallary(grossSallary);
		int result =edao.employeDetails(bo);
		
		return result==0?"Employee Details not Recorded":"Employee Details Enrolled";
	}

}
