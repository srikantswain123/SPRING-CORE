package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainControler {
	private CustomerMgmtService service=null;

	public MainControler(CustomerMgmtService service) {
		this.service = service;
	}
	public String register(CustomerVO vo)throws Exception {

		CustomerDTO dto=null;
		String result=null;
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRtintrest(Float.parseFloat(vo.getRtintrest()));
		dto.setTime(Integer.parseInt(vo.getTime()));
		result=service.calculate(dto);

		return result;
	}

}
