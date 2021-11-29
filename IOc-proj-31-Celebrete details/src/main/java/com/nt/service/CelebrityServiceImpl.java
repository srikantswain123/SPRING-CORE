package com.nt.service;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CelibrityBo;
import com.nt.dao.CelibrityDao;
import com.nt.dto.CelebrityDto;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public final class CelebrityServiceImpl implements CelibrityService {
	@NonNull
	private CelibrityDao dao;

	@Override
	public List<CelebrityDto> fetchCelibrityDetails() throws Exception {
		SimpleDateFormat sdf=null;
		
		
		List<CelibrityBo> listBo=null;
		//create ListDto Object
		List<CelebrityDto> listDto=new ArrayList();
		
		//convert to listBo to ListDto
		listBo=dao.getCelebrityDetails();
		listBo.forEach(lbo->{
			String children=null,spouse=null;
			CelebrityDto dto=new CelebrityDto();
			BeanUtils.copyProperties(lbo, dto);
			if(lbo.getChildrens()==null) {
			children="No childrens";
			dto.setChildrens(children);
			}
			
			if(lbo.getSpouseName()==null) {
				spouse="Single";
				dto.setSpouseName(spouse);
			}
			
			java.util.Date  date=new Date(lbo.getAge());
			int cdate1=date.getYear();
			int cdate=new Date().getYear();
			dto.setAge(cdate-cdate1);
			dto.setSno(listDto.size()+1);
			listDto.add(dto);
		
		});
		
		return listDto;
	}//method

}//class
