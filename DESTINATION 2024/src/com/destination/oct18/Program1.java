package com.destination.oct18;

import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String str = sc.next();
	String str_tmp = "";
	int flag =0;
	for(int i =str.length()-1;i>=0;i--) {
		str_tmp = str_tmp + str.charAt(i);
		
	}
	System.out.println("The reversed string is : " +str_tmp);
	System.out.println("=========================");
	//approch1
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!= str_tmp.charAt(i)) {
			flag =-1;
			System.out.println("String is not palindrome");
			break;
		}
	}
	if(flag==0) {
		System.out.println("String is a palindrome");
	}
	System.out.println("=============================");
	//approch2
	if(str.equals(str_tmp)) {
		System.out.println("String is a palindrome");
	}
	else {
		System.out.println("String is not a palindrome");
	}
}
}
