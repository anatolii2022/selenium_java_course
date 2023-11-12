package com.udemy.selenium.core_java;

public class ChildClass002 extends ChildClass003 {

	int a;

	public ChildClass002(int a) {
		super(a); //involve the parent constructor 
		this.a = a;
	}

	public int increment() {
		a = a + 1;
		return a;
	}

	public int decrement() {
		a = a - 1;
		return a;
	}

}
