package com.nt.dao;

import java.util.List;

import com.nt.bo.CoronaBo;

public interface CoronaDao {
	
	public List<CoronaBo> getCoronaDetails()throws Exception;

}
