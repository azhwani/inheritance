package com.test;

public class Dog extends Animal {
	
	private String name;
	
	final int AN = 2;
	
	static int a;   // HIDING : THIS STATIC VAR WILL HIDE THE SAME VAR IN SUPERCLASS
	
	public Dog() {
		//super();  // CALL OF DEFAULT CONTRUCTOR IS DONE IMPLICITLY
		System.out.println("Dog");

	}
	
	public Dog(String name) {
		// BY DEFAULT AND IMPLICITLY THE COMPILER WILL CALL DEFAULT SUPER CONSTRUCTOR NOT PARAMETRED ONE
		// IF YOU WANT TO CALL PARAMETRED CONTRUCTOR YOU HAVE TO DEFINE : super(name);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("unused")
	private void pdisplay() {
		System.out.println("Private Hello Dog");
	}
	
	public void display() {
		
		System.out.println("Hello Dog");
		System.out.println(super.AN );
		System.out.println(this.AN );
		System.out.println(a);    // SHADOWING HAPPENS HERE : TO SOLVE THIS YOU NEED TO USE CLASS NAMES
		System.out.println(Animal.a); // 2
		System.out.println(Dog.a);    // 0 
		
		sdisplay();  // METHOD HIDING HAPPENS HERE
		Animal.sdisplay();
		Dog.sdisplay();
		
		super.fdisplay();
	}
	
	public static void sdisplay() {
		System.out.println("Static Hello Dog");
	}

	public void subdisplay(){
		System.out.println("Subclass Hello Dog");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
