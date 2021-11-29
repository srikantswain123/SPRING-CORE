package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.PoliticianBo;
import com.nt.dao.PoliticianDao;
import com.nt.dto.PoliticianDto;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public final class PoliticianServiceImpl implements PoliticianService {
	@NonNull
	private PoliticianDao dao;
	

	@Override
	public List<PoliticianDto> fetchDetails() throws Exception {
		List<PoliticianDto> listDto=new ArrayList();
		List<PoliticianBo> listBo=null;
		//get Dao class Details
		listBo=dao.getPoliticianDetails();
		//convert each record  from bo to dto
		listBo.forEach(lbo->{
			PoliticianDto dto=new PoliticianDto();
			BeanUtils.copyProperties(lbo,dto);
			
			dto.setSino(listDto.size()+1);
			listDto.add(dto);
		
			
		});//forEach
		return listDto;
	}//method

}//class
