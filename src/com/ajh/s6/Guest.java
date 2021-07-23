package com.ajh.s6;

public class Guest {

	private int money;
	private int point;

	// 1개만 구매 매개변수는 1개만 선언 가능
	public void buy(Electric elec) {
		this.money = this.money - elec.getPrice();
		this.point = this.point + elec.getPoint();

	}

	// 여러개 구매 매개변수는 1개만 선언
	public void buy(Electric[] electrics) {

		for (int i = 0; i < electrics.length; i++) {

			this.money = this.money - electrics[i].getPrice();
			this.point = this.point + electrics[i].getPoint();
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
