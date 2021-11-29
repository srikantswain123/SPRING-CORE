package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements CustomerMgmtService {
	private CustomerDAO dao;
	

	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}


	@Override
	public String calculate(CustomerDTO dto) throws Exception {
		float intrest=0;
		intrest=(dto.getPamt()*dto.getRtintrest()*dto.getTime())/100.0f;
		CustomerBO bo=null;
		bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setInterset(intrest);
		int count=dao.insert(bo);
		
		
		return count==0?"Cutomer Registration Failed":"Customer Registartion Succeded";
	}

}
