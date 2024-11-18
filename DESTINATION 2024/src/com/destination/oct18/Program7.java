package com.destination.oct18;

import java.util.Arrays;
import java.util.Scanner;

/*
 * write a program to check the given program is an anagram or not 
 */
public class Program7 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//System.out.println("enter the 1st string");
	String s1 = "top";
	//System.out.println("enter the 2nd string");
	String s2 = "pot";
	if(s1.length()==s2.length()) {
			char arr1[] = new char[s1.length()];
			char arr2[] = new char[s2.length()];
			for(int i=0;i<arr1.length;i++) {
	    	arr1[i] = s1.charAt(i);
	    	arr2[i] = s2.charAt(i);
	    }
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    String sorted1=new String(arr1);
	    String sorted2=new String(arr2);
	    if(sorted1.equals(sorted2)) {
	    	System.out.println("Anagram");
	    }
	    else {
	    	System.out.println("not Anagram");
	    }
	    
	}
	
	
}
}
