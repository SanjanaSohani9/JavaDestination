package com.destination.oct18;

import java.util.Scanner;

/*
 * write a program tp reverse the given string witout changing the position of the string 
 */
public class Program6 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the String : ");
	 String str = sc.nextLine();
	 
	 int count =0;
	 str = str.trim();
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)==' '&& str.charAt(i+1) !=' ') {
			 count++;
		 }
	 }
	 int wd_cnt=count+1;
	 System.out.println("The total number of words = "+wd_cnt);
	 
	 String arr[]= new String[wd_cnt];
	 int temp =0;
	 String str1 ="";
	 for(int i =str.length()-1;i>=0;i--) {
		 if(str.charAt(i)==' ') {
			 arr[temp]=str1;
			 str1="";
			 temp++;
		 }
		 else {
			 str1=str1+str.charAt(i);
		 }
	 }
	 arr[temp]=str1;
	 
	 for(int i=arr.length-1;i>=0;i--) {
		 System.out.println(arr[i]+" ");
	 }
}
}
