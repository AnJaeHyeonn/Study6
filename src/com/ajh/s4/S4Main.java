package com.ajh.s4;

public class S4Main {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();

		tiger.sound();
		tiger.wash();

		cat.sound();
		cat.drop();

		dog.sound();
		dog.gouard();

		// case
		// 모으려고하는데이터타입 [] 변수명;
		// Tiger is a Animal
		Animal animal = tiger;

		// Cat타입은 Animal타입 이다
		animal = cat;
		animal = dog;

		Animal[] animals = new Animal[3];

		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = dog;

		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}

		System.out.println("==============================");

		Animal a = animals[1];
		tiger = (Tiger) a;

		System.out.println(a instanceof Tiger);

		System.out.println("==============================");
		Tiger t2 = new Tiger();
		Animal a2 = t2;

		Animal animal2 = new Animal();
		Tiger tiger2 = (Tiger) animal2;
		tiger2.sound();
		tiger2.wash();

//		Tiger t = (Tiger) a;
//
//		t.sound();
//		t.wash();

	}

}
