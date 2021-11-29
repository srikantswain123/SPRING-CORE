package com.cb.service;

import com.cb.extcomp.Iiplcomp;

public class IplServiceImpl implements IiplService {
  private Iiplcomp comp;
	public IplServiceImpl(Iiplcomp comp) {
		System.out.println(this.getClass()+" "+this.getClass().getSuperclass());
	this.comp = comp;
      }


	@Override
	public String getScore(int mid) {
		return comp.getIplScore(mid);
	}

}
