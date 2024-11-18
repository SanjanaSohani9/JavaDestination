package com.detination.september.nov7;
abstract class Plane1{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Cargo Plane fly at low heights...");
	}
	void takeOff() {
		System.out.println("Cargo plane took off....");
	}
	void land() {
		System.out.println("Cargo plane had landed");
	}
	void carryGoods() {
		System.out.println("cargo plane carry goods......");
	}
}
class Passenger1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Passenger  Plane fly at medium heights....");
	}
	void takeOff() {
		System.out.println("Passenger plane took off....");
	}
	void land() {
		System.out.println("Passeger plane had landed");
	}
	void carryPassenger() {
		System.out.println("PassengerPlane carry passenger....");
	}
}
class Fighter1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter Plane fly at high heights....");
	}
	void takeOff() {
		System.out.println(" plane took off....");
	}
	void land() {
		System.out.println("Fighter plane had landed");
	}
	void carryFighter() {
		System.out.println("FighterPlane carry Weapons");
	}
}
public class AbstractPlan {
 public static void main(String[] args) {
	 CargoPlane1 cp = new CargoPlane1();
		Passenger1 p = new Passenger1();
		 Fighter1  f = new  Fighter1 ();
		 Plane1 ref;
		 
}
}
