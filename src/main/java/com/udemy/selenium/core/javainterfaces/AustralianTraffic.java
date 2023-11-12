package com.udemy.selenium.core.javainterfaces;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {

		CentralTraffic australianTraffic = new AustralianTraffic();
		australianTraffic.greenGo();
		australianTraffic.yellowWait();
		australianTraffic.redStop();
		
		AustralianTraffic australianTraffic2 = new AustralianTraffic();
		australianTraffic2.walkSymbol();
		
		ContinentalTraffic continentalTraffic = new AustralianTraffic();
		continentalTraffic.trainSymbol();

	}

	@Override
	public void greenGo() {
		System.out.println("GreenGo implementation");

	}

	@Override
	public void yellowWait() {
		System.out.println("YellowWait implementation");

	}

	@Override
	public void redStop() {
		System.out.println("RedStop implementation");

	}

	public void walkSymbol() {
		System.out.println("Walking");
	}

	@Override
	public void trainSymbol() {
		System.out.println("Stop when seeing train symbol");
		
	}

}
