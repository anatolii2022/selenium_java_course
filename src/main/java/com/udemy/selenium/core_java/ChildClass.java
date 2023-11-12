package com.udemy.selenium.core_java;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	@Test
	public void test001() {
		doThis();
	}
	
	@Test
	public void test002() {
		System.out.println("Method from it own class");
	}
	
	@Test
	public void test003() {
		
		int a = 3;
		
		ChildClass002 child2 = new ChildClass002(3);
		
		System.out.println(child2.increment());
		
		System.out.println(child2.decrement());
		
		System.out.println(child2.multiplyTwo());
		
		System.out.println(child2.multiplyThree());
		
	}
}
