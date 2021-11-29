package com.nt.dao;

import java.util.List;

import com.nt.bo.PoliticianBo;

public interface PoliticianDao {
	
	public List<PoliticianBo> getPoliticianDetails()throws Exception;

}
