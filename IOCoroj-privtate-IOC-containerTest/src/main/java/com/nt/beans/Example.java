package com.nt.beans;

public class Example {
	int amt;

	public Example(int amt) {
		super();
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Example [amt=" + amt + "]";
	}
	
	
	private static class Sample{
		
		private int age;

		private Sample(int age) {
			System.out.println("person age:"+age);
			this.age = age;
		}

		@Override
		public String toString() {
			return "Sample [age=" + age + "]";
		}
		
		
		
	}
	

}
