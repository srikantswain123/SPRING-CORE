package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CoronaBo;
import com.nt.dao.CoronaDao;
import com.nt.dto.CoronaDto;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public final class CoronaServiceImpl implements CoronaService {
	@NonNull
	private CoronaDao dao;
	

	@Override
	public List<CoronaDto> fetchDetails() throws Exception {
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
