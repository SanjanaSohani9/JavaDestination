package com.detination.september.nov7;
abstract class Plane2{
	 void takeOff1() {
		System.out.println("Plane can takeoff.......");
	}
	abstract void fly1();
	 void land1() {
		System.out.println("plan landed");
	}
}

public class AbstractObjPlane {
	public static void main(String[] args) {
	Plane2 p2;
	Plane2 p3 = new Plane2() {
		@Override
		public void fly1() {
			System.out.println("Plane fly");
		}
	};
	System.out.println(p3);
	p3.takeOff1();
	p3.fly1();
	p3.land1();
  }
}
