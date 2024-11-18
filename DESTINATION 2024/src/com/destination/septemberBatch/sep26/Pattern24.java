package com.destination.septemberBatch.sep26;

import java.util.Scanner;

/*
 * A B C D E
 * F G H I J
 * K L M N O
 * P Q R S T
 * U V W X Y
 */
public class Pattern24 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size");
	  	   int  n = sc.nextInt();
	  	   char c ='A';
	  	   for(int i=1;i<=n;i++) {
	  		   //inner loop
	  		   for(int j=1;j<=n;j++) {
	  			   System.out.print(c+" ");
	  			   c++;
	  		   }
	  		  System.out.println();
	  	   }
	  	  
}
}
