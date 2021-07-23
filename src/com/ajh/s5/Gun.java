package com.ajh.s5;

public class Gun extends Item implements Weapon {

	@Override
	public void attack() {
		System.out.println("탕탕");
	}

}
