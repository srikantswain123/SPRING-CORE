package com.nt.beans;

import java.util.Arrays;

public class ArrayAndCollectionInjectionTest {
	private int marks[];
	

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	




	@Override
	public String toString() {
		return "ArrayAndCollectionInjectionTest [marks=" + Arrays.toString(marks) + "]";
	}
	
	
	

}
