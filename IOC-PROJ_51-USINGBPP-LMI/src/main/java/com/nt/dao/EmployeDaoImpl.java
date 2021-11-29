package com.nt.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeBo;
@Repository("empDao")
@Scope("singleton")
public class EmployeDaoImpl implements IEmployeDao {
	public EmployeDaoImpl() {
		System.out.println("EmployeDaoImpl::using zero ParmConstructor");
	}

	@Override
	public int employeDetails(EmployeBo bo) {
		System.out.println("Employe Details::"+bo);
		return 1;
	}

}
