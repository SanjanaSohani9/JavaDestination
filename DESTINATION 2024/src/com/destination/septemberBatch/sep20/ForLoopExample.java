package com.destination.septemberBatch.sep20;

public class ForLoopExample {
  public static void main(String[] args) {
	System.out.println("====Example of For Loop=====");
	System.out.println("++++++++++++++++");
	for(int i=0;i<=5 ;i++) {
		System.out.println("Tomorrow class at 10am");
	}
	System.out.println("======Example of while loop=====");
	System.out.println("+++++++++++++++++++++++");
	int i=1;
	while(i<=5) {
		System.out.println("Tomorrow class at 10:10am");
		i++;
	}
	System.out.println("========Example of Do While Loop=======");
	System.out.println("+++++++++++++++++++++++");
	int j=1;
	do {
		System.out.println("Tomorrow class at 11 am");
		j++;
	}while(j<=5);
}
}
