package com.nt.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;
@Repository("stuDao")
@Scope("singleton")
public class StudentDaoImpl implements IStudentDao {

	 public StudentDaoImpl() {
     System.out.println("StudentDaoImpl::using zero Param constructor");
	 }
	@Override
	public int studentDetails(StudentBo bo) {
		System.out.println("Student Details"+bo);
		return 1;
	}

}
