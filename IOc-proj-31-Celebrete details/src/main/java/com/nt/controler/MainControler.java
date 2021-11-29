package com.nt.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.CelebrityDto;
import com.nt.service.CelibrityService;
import com.nt.vo.CelebrityVo;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class MainControler {
	@NonNull
	private CelibrityService service;
	public List<CelebrityVo> getDetails()throws Exception{
		//create listDto Object
		List<CelebrityVo> listVo=new ArrayList();
		List<CelebrityDto> listDto=null;
		
		//get Dto object set to vo
		listDto=service.fetchCelibrityDetails();
		listDto.forEach(ldo->{
		  CelebrityVo vo=new CelebrityVo();
		  BeanUtils.copyProperties(ldo, vo);
		  vo.setSino(ldo.getSno().toString());
		  vo.setChildrens(ldo.getChildrens());
		  vo.setAge(ldo.getAge().toString());
		  listVo.add(vo);
		 
		});
		
		
		
		
		return listVo;
		
	}//method

}//class
