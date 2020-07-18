package com.epam.design_patterns;

public class ECE extends Template {

	@Override
	public void study() {
		System.out.println("Studying ECE subjects");
	}

	@Override
	public void test() {
		System.out.println("Giving ECE subjects test");
	}

	@Override
	public void result() {
		System.out.println("Passing ECE subjects");
		System.out.println();
		
	}

}
