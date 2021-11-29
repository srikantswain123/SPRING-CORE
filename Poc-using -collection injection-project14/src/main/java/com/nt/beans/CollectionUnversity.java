package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class CollectionUnversity {
	private Set<Integer> facultyNo;
	private Set<Date> joinDate;
	public CollectionUnversity(Set<Integer> facultyNo, Set<Date> joinDate) {
		this.facultyNo = facultyNo;
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "CollectionUnversity [facultyNo=" + facultyNo + ", joinDate=" + joinDate + "]";
	}
	
	

	
	
	
	

}
