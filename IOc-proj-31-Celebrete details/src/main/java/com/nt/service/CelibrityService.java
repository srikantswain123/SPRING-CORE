package com.nt.service;

import java.util.List;

import com.nt.dto.CelebrityDto;

public interface CelibrityService {
	public List<CelebrityDto> fetchCelibrityDetails()throws Exception;

}
