package com.ajh.s5;

public class S5Main {
	public static void main(String[] args) {
		Character character = new Character();
		Sword sword = new Sword();
		
		
		character.weapon = sword;
		character.weapon.attack();

		// 사냥 성공했더니 Gun을 드랍
		Gun gun = new Gun();
		character.weapon = gun;
		character.weapon.attack();

	}

}
