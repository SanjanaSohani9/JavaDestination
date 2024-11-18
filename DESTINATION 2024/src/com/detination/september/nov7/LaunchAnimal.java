package com.detination.september.nov7;

class Animal{
	void eat() {
		System.out.println("aniaml eat ....");
	}
	void sleep() {
		System.out.println("animal sleep......");
	}
	void breath() {
		System.out.println("animal breath......");
	}
}
class Elephant extends Animal{
	@Override
	 void breath() {
		System.out.println("Elephant can breath from trunk...");
	}
	void type1(){
		System.out.println("Elephant eats plants ");
	}
}
class Tiger extends Animal{
	@Override
	 void breath() {
		System.out.println("Tiger can breath from trunk...");
	}
	void type2() {
		System.out.println("Tiger eats  meat ");
	}
}
class Lion extends Animal{
	@Override
	 void breath() {
		System.out.println("Lion can breath from trunk...");
	}
	void type3() {
		System.out.println("Lion eats meat");
	}
}

public class LaunchAnimal {
	public static void main(String[] args) {
		Elephant ee = new Elephant();
		Tiger tt = new Tiger ();
		Lion ll = new Lion();
		Animal ref;
		System.out.println("Animal Elephant.....");
		ref =ee;
		ref.breath();
		ref.eat();
		ref.sleep();
		ee.type1();// own method
		System.out.println("======================");
		System.out.println("Animal Tiger.....");
		ref.breath();
		ref.eat();
		ref.sleep();
		tt.type2();// own method
		System.out.println("======================");
		System.out.println("Animal Lion.....");
		ref.breath();
		ref.eat();
		ref.sleep();
		ll.type3();// own method
		System.out.println("======================");
	}
}
