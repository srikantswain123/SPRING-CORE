package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CoronaBo;
import com.nt.dao.CoronaDao;
import com.nt.dto.CoronaDto;
@Named("service")
public final class CoronaServiceImpl implements CoronaService {
	@Inject
	private CoronaDao dao;
	/*
	 * @Value("${cos.a}") int a;
	 */

	@Override

	public List<CoronaDto> fetchDetails() throws Exception {
		//System.out.println(a);
		List<CoronaDto> listDto=new ArrayList();
		List<CoronaBo> listBo=null;
		//get Dao class Details
		listBo=dao.getCoronaDetails();
		//convert each record  from bo to dto
		listBo.forEach(lbo->{
			CoronaDto dto=new CoronaDto();
			BeanUtils.copyProperties(lbo,dto);
			
			dto.setSino(listDto.size()+1);
			listDto.add(dto);
		
			
		});//forEach
		return listDto;
	}//method

}//class
