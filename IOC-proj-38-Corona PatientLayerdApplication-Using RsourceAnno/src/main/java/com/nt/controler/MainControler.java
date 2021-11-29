package com.nt.controler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.dto.CoronaDto;
import com.nt.service.CoronaService;
import com.nt.vo.CoronaVo;

@Named("mco")
public class MainControler {
    @Resource
	private CoronaService service;

	public List<CoronaVo> getDetails() throws Exception {
		List<CoronaDto> listDto = null;
		List<CoronaVo> listVo = new ArrayList();
		/// get details from service to controler

		listDto = service.fetchDetails();
		// convert each record Dto to Vo

		listDto.forEach(ldo -> {
			CoronaVo vo = new CoronaVo();
			BeanUtils.copyProperties(ldo, vo);
			vo.setAge(ldo.getAge().toString());
			vo.setPatientId(ldo.getPatientId().toString());
			vo.setTotalAmt(ldo.getTotalAmt().toString());
			vo.setStaying_days(ldo.getStaying_days().toString());
			vo.setSino(ldo.getSino().toString());
			listVo.add(vo);

		});// forEach
		return listVo;

	}// method

}// class
