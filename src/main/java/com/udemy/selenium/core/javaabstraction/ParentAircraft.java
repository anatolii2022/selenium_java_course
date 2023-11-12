package com.udemy.selenium.core.javaabstraction;

public abstract class ParentAircraft {
	
	public void engine() {
		System.out.println("Follow engine quidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow safety guidelines");
	}
	
	public abstract void bodyColor();

}
