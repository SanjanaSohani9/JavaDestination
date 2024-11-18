package com.detination.september.nov7;
class Heart1{
	double beats;

	public Heart1(double beats) {
		super();
		this.beats = beats;
	}

	public double getBeats() {
		return beats;
	}
	
}
class Brain1{
	double capacity;

	public Brain1(double capacity) {
		super();
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}
	
}
class Human{
	Heart1 h = new Heart1(23.8);
	Brain1 b = new Brain1(789.76);
	
}
class Car{
	String name;
	String color;
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	
}
class Mobile1{
	String name;
	String company;
	public Mobile1(String name, String company) {
		super();
		this.name = name;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	
}
class Student1 extends Human{
	void hasCar(Car ca) {
		System.out.println(ca.getName());
		System.out.println(ca.getColor());
	}
	void hasMobile(Mobile1 mo) {
		System.out.println(mo.getCompany());
		System.out.println(mo.getName());
	}
}
public class Launch3 {
public static void main(String[] args) {
	Car c = new Car("BMW","black");
	Mobile1 me = new Mobile1("xiome","redme");
	Student1 st2 = new Student1();
	Human hu = new Human();
	st2.hasCar(c);
	st2.hasMobile(me);
	System.out.println(st2.h.getBeats());
	System.out.println(st2.b.getCapacity());
}
}
