package com.ajh.s6;

public class Computer extends Electric {

	private int ssd;

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public void info() {
		super.info();
		System.out.println("SSD : " + ssd);
	}

}
