package com.ajh.s1;

//추상클래스
public abstract class Product {

	private String company;
	private String cpu;
	private int ram;
	private int price;

	// 추상메서드
	public abstract void info();

	// 일반메서드
	public void info2() {
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
