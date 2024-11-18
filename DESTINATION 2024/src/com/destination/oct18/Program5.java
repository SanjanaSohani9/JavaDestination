package com.destination.oct18;

import java.util.Scanner;

public class Program5 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string ");
	String str = sc.nextLine();
	
	int condition_1 =0;
	int condition_2 =0;
	int condition_3 =0;
	int condition_4 =0;
	
	if(str.length()>=10) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				condition_1=1;
			}
			else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				condition_2=1;
			}
			else if (str.charAt(i)>= 48 && str.charAt(i)<=57) {
				condition_3=1;
			}
			else if (str.charAt(i)=='@' || str.charAt(i)== '$' || str.charAt(i)=='#' || 
					str.charAt(i)=='%' || str.charAt(i)=='!' || str.charAt(i)=='*') {
				condition_4=1;
			}
		}
	}
	if(condition_1==1 && condition_2==1 && condition_3==1 && condition_4 ==1) {
		System.out.println("Valid Passwoed");
	}
	else {
		System.out.println("Invalid Password");
	}
	
}
}
