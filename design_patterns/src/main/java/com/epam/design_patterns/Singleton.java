package com.epam.design_patterns;

public class Singleton {
	private int id;
	private String data;
	private static final Singleton object=new Singleton(101,"John");
	
	private Singleton(int id, String data) {
		this.id = id;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public static Singleton getInstance(){
		return object;
	}
	
}
