package com.nt.controler;

import com.nt.dto.PatientDTO;
import com.nt.service.CorornaPatientMGmtService;
import com.nt.vo.PatientVO;

public class MainControler {
	private CorornaPatientMGmtService service;
	

	public MainControler(CorornaPatientMGmtService service) {
		System.out.println("Controler Class using 1 param constructor");
		this.service = service;
	}
	public String Register(PatientVO vo)throws Exception{
		String result=null;
		PatientDTO dto=null;
		dto=new PatientDTO();
		dto.setPname(vo.getPname());
		dto.setAddr(vo.getPaddr());
		dto.setDays(Integer.parseInt(vo.getStay()));
		dto.setPage(Integer.parseInt(vo.getPage()));
		result=service.submit(dto);
		
		
		return result;
	}
	

}
