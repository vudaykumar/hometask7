package com.epam.design_patterns;

public class CSE extends Template {

	@Override
	public void study() {
		System.out.println("Studying CSE subjects");
	}

	@Override
	public void test() {
		System.out.println("Giving CSE subjects test");
	}

	@Override
	public void result() {
		System.out.println("Passing CSE subjects");
		System.out.println();
	}

}
