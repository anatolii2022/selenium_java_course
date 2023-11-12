package com.udemy.selenium.core.javainheritance;

public class Auto extends Vehicle {
	
	public static void main(String[] args) {
		Auto a = new Auto();
		a.colour();
		a.audioSystem();
	}
	
	public void engine() {
		System.out.println("New engine code is implemented");
	}
	
	public void colour() {
		System.out.println(colour);
	}
	
	@Override
	public void audioSystem() {
		System.out.println("New Audio code is implemented");
	}

}
