package com.destination.october25;

import java.util.Scanner;

class farmer {
	double principal;
	static double rate;
	double time;
	double Si;
  
 
    static {
    	rate = 2.678;
    }
    void collectData() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the principle amount :");
    	principal = sc.nextDouble();
    	System.out.println("enter the time duration ;");
    	time = sc.nextDouble();
    }
    void calculator() {
    	Si = (principal*rate*time)/100;
    }
    void display() {
    	System.out.println("the Si=" +Si);
    }
}
public class SimpleIntrest {
 public static void main(String[] args) {
	farmer f1 = new farmer();
	f1.collectData();
	f1.calculator();
	f1.display();
	System.out.println("======================");
	farmer f2 = new farmer();
	f2.collectData();
	f2.calculator();
	f2.display();
	System.out.println("===========================");
	farmer f3 = new farmer();
	f3.collectData();
	f3.calculator();
	f3.display();
}
}
