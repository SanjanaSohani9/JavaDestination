package com.destination.oct18;

import java.util.Scanner;

/*
 * write a program to check the given string is a pangram 
 */
public class Program8 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string  ");
	String str= sc.nextLine();
	str = str.toUpperCase();
	int arr[] = new int [26];
	for(int i =0;i<arr.length;i++) {
		arr[i] = 0;
	}
	for(int i =0;i<str.length();i++) {
		int temp = str.charAt(i)-65;
		arr[temp] =1 ;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=1) {
			System.out.println("Not a pangram");
			System.exit(0);
		}
	}
	System.out.println("It is a pangram");
}
}
