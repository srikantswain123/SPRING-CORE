package com.nt.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.PoliticianDto;
import com.nt.service.PoliticianService;
import com.nt.vo.PoliticianVo;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MainControler {
	@NonNull
	private PoliticianService service;

	public List<PoliticianVo> getDetails() throws Exception {
		List<PoliticianDto> listDto = null;
		List<PoliticianVo> listVo = new ArrayList();
		/// get details from service to controler

		listDto = service.fetchDetails();
		// convert each record Dto to Vo

		listDto.forEach(ldo -> {
			PoliticianVo vo = new PoliticianVo();
			BeanUtils.copyProperties(ldo, vo);
			vo.setAge(ldo.getAge().toString());
			vo.setSino(ldo.getSino().toString());
			listVo.add(vo);

		});// forEach
		return listVo;

	}// method

}// class
