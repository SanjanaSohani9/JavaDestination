package com.destination.october25;

class Oparete {
	int add(int a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a ,int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add (double a , double b) {
		return a+b;
	}
	double add(double a ,int b) {
		return a+b;
	}
	double add(int a , double b) {
		return a+b;
	}
	double add(double a, float b,int c) {
		return a+b+c;
	}
	double add(float a,double b,int c) {
		return a+b+c;
	}
	double add(int a,float b,double c) {
		return a+b+c;
	}
}
public  class Calculator{
	public static void main(String[] args) {
		Oparete o = new Oparete();
		System.out.println(o.add(10, 20));
		System.out.println(o.add(10.7f, 30.6f));
		System.out.println(o.add(30.56, 56.98));
		System.out.println(o.add(10,35.67f, 45.789));
	}
}
