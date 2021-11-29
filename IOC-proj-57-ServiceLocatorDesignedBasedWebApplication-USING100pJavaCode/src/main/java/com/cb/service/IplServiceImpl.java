package com.cb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.extcomp.Iiplcomp;
@Service("service")
public class IplServiceImpl implements IiplService {
	
  @Autowired
  private Iiplcomp comp;


	@Override
	public String getScore(int mid) {
		return comp.getIplScore(mid);
	}

}
