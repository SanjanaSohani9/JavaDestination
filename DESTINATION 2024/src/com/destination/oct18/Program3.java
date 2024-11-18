package com.destination.oct18;
 
import java.util.Scanner;
 public class Program3{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = sc.nextLine();
		
		String str_alpha ="";
		String str_numaric ="";
		String str_chars ="";
		for(int i =0;i<str.length();i++) {
			if((str.charAt(i)>='A' && str.charAt(i)>='Z') || (str.charAt(i)>='a'&& str.charAt(i)>='z') ) {
				str_alpha = str_alpha + str.charAt(i);
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				str_numaric = str_numaric + str.charAt(i);
			}
			else {
				str_chars = str_chars +str.charAt(i);
			}
		}
		System.out.println("The alphabetical string is :"+str_alpha);
		System.out.println("The numaric string is :"+str_numaric);
		System.out.println("The special character is :"+str_chars);
		
	}
 }
