package com.udemy.selenium.core_java;

public class StaticDemo {

	// instance variables
	String name;
	String address;
	
	// class variables
	static String city;
	static int i;
	
	// static block
	static {
		city = "Bangladesh";
		i = 0;
	}

	public StaticDemo(String name, String address) {
		// local variables
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(name + " " + address + " " + city);
	}
	
	//class method
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo("Ram", "Manglaro");
		obj.getAddress();
		
		StaticDemo obj2 = new StaticDemo("Bob", "Panglaro");
		obj2.getAddress();
		
		//static, class method - object independent
		StaticDemo.getCity();
		StaticDemo.i=4;
		
		//non static
		obj.address = "XYZ";
	}

}
