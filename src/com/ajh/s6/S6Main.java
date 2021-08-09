package com.ajh.s6;

public class S6Main {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setBrand("Samsung");
		tv.setColor("Black");
		tv.setPrice(3000000);
		tv.setPoint(300);
		tv.setSize(100);

		Computer computer = new Computer();
		computer.setBrand("LG");
		computer.setColor("Pink");
		computer.setPrice(1700000);
		computer.setPoint(17);
		computer.setSsd(512);

		Aircon aircon = new Aircon();
		aircon.setBrand("Carrier");
		aircon.setColor("Green");
		aircon.setPrice(1500000);
		aircon.setPoint(15);
		aircon.setPyung(6);

		tv.info();
		computer.info();
		aircon.info();

		Guest ajh = new Guest();
		ajh.setMoney(5000000);
		ajh.setPoint(10);

//		ajh.buy(tv);
//		System.out.println(ajh.getMoney());
//		System.out.println(ajh.getPoint());

		Electric[] electrics = new Electric[2];
		electrics[0] = tv;
		electrics[1] = aircon;

		ajh.buy(electrics);

		System.out.println(ajh.getMoney());
		System.out.println(ajh.getPoint());
	}

}
