package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.PatientDTO;

public class CorornaPatientMGmtServiceImpl implements CorornaPatientMGmtService {
	private PatientDAO dao;
	

	public CorornaPatientMGmtServiceImpl(PatientDAO dao) {
		this.dao = dao;
	}


	@Override
	public String submit(PatientDTO dto) throws Exception {
		float Amt=0.0f;
		int result=0;
		PatientBO bo=null;
		bo=new PatientBO();
		bo.setPname(dto.getPname());bo.setPaddr(dto.getAddr());bo.setDays(dto.getDays());bo.setPage(dto.getPage());
		Amt=dto.getDays()*3000;
		bo.setTotalAmt(Amt);
		result=dao.register(bo);
		
		return result==0?"Registration Faield":"Registration Succeded";
	}

}
