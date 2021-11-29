package com.nt.beans;

import java.util.Set;

public class EnggCourse {
	private Set<String> course;

	public Set<String> getCourse() {
		return course;
	}

	public void setCourse(Set<String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "EnggCourse [course=" + course + "]";
	}
	
	
    

}
