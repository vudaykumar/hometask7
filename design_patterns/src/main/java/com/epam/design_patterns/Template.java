package com.epam.design_patterns;

public abstract class Template {
	public abstract void study();
	public abstract void test();
	public abstract void result();
	
	public void academics() {
		study();
		test();
		result();
	}
	
}
