package com.test;

public class Animal {
	
	private String name;
	
	final int AN = 1;
	
	static int a;
	
	public Animal() {
		System.out.println("Animal 1");
		a = 2;
	}
	
	public Animal(String name) {
		System.out.println("Animal 2");
		this.name  = name;
		a = 2;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
	   System.out.println("Hello Animal");
	}
	
	@SuppressWarnings("unused")
	private void pdisplay() {
		System.out.println("Private Hello Animal");
	}
	
	public final void fdisplay() {
		System.out.println("Final Hello Animal");
	}
	
	public static void sdisplay() {
		System.out.println("Static Hello Animal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	

}
