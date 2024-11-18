package com.destination.oct18;

import java.util.Scanner;

public class Program4 {
 public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the string");
	String str = sc.nextLine();
	int count =0;
	str = str.trim();
	for(int i =0;i<str.length();i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			
		}
	}
	System.out.println("The total number of word ="+(count+1));
}
}
