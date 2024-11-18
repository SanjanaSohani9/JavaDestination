package com.destination.september.november14;

import java.util.Scanner;

public class ExceptionCode1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numerator");
	int num = sc.nextInt();//critical statement
	System.out.println("enter the denomenator");
	int den = sc.nextInt();//critical statement
	
	int res = num/den;// critical statement
	
	System.out.println(res);
}
}
