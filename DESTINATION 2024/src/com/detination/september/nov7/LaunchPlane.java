package com.detination.september.nov7;
class Plane{
	void takeOff() {
		System.out.println("Planes can takeoff..can.");
	}
	void fly() {
		System.out.println("Planes can fly........");
	}
	void land() {
		System.out.println("Planes can land........");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane fly at low heights...");
	}
	void carryGoods() {
		System.out.println("cargo plane carry goods......");
	}
}
class Passenger extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger  Plane fly at medium heights....");
	}
	void carryPassenger() {
		System.out.println("PassengerPlane carry passenger....");
	}
}
class Fighter extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane fly at high heights....");
	}
	void carryFighter() {
		System.out.println("FighterPlane carry Weapons");
	}
}
public class LaunchPlane {
public static void main(String[] args) {
	CargoPlane cp = new CargoPlane();
	Passenger p = new Passenger();
	 Fighter  f = new  Fighter ();
	 Plane ref;
	 System.out.println("Cargo plane .....");
		ref =cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();// own method
		System.out.println("======================");
		System.out.println("passenger plane.....");
		ref.takeOff();
		ref.fly();
		ref.land();
		p.carryPassenger();// own method
		System.out.println("======================");
		System.out.println("Fighter plane.....");
		ref.takeOff();
		ref.fly();
		ref.land();
		f.carryFighter();// own method
		System.out.println("======================");
}
}
