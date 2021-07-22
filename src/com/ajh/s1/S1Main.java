package com.ajh.s1;

public class S1Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tablet tablet = new Tablet();

		computer.setCompany("MSI");
		phone.setCompany("Samsung");
		tablet.setCompany("LG");
		
		computer.info();
		phone.info();
		tablet.info();
		
		computer.info2();
	}

}
