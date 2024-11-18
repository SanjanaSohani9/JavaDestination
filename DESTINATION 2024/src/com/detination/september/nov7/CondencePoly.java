package com.detination.september.nov7;
class Animal1{
	void eat() {
		System.out.println("Animal eat.....");
	}
	void sleep() {
		System.out.println("Animal sleep......");
	}
	void breath() {
		System.out.println("Animal breath ..........");
	}
}
class Cat extends Animal1 {
	    @Override
	    void breath() {
	    	System.out.println("Cat can breath ........");
	    }
	    void charterstics1() {
	    	System.out.println("Cats are cute.....");
	    }
}
class Dog extends Animal1 {
    @Override
    void breath() {
    	System.out.println("Dog can breath........");
    }
    void charterstics2() {
    	System.out.println("Dogs are loyal.....");
    }
}
class Rabbit extends Animal1 {
    @Override
    void breath() {
    	System.out.println("Rabbit can breath ........");
    }
    void charterstics3() {
    	System.out.println("Rabbits are soft.....");
    }
}
class House{
	void permit(Animal1 ref) {
		ref.eat();
		ref.sleep();
		ref.breath();
	}
}
public class CondencePoly {
 public static void main(String[] args) {
	 Cat c = new Cat();
	 Dog d = new Dog();
	 Rabbit r = new Rabbit();
	House h = new House();
	h.permit(c);
	h.permit(d);
	h.permit(r);
	c.charterstics1();
	d.charterstics2();
	r.charterstics3();
}
}
