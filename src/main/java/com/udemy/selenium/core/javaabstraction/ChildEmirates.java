package com.udemy.selenium.core.javaabstraction;

public class ChildEmirates extends ParentAircraft {

	public static void main(String[] args) {
		ChildEmirates emirates = new ChildEmirates();
		emirates.engine();
		emirates.bodyColor();
		emirates.safetyGuidelines();
	}

	@Override
	public void bodyColor() {
		System.out.println("Logo of the company");

	}

}
