package com.destination.septemberBatch.sep26;

import java.util.Scanner;

/*
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 */
public class Pattern22 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size");
  	 int n = sc.nextInt();
  	 	for(int i=1;i<5;i++) {
		//inner loop
		
  	 		for(int j=1;j<5;j++) {
  	 			if(j%2==0) {
			System.out.print("0 ");
		}else {
			System.out.print("1 ");
		}
	      
		}
		System.out.println();
		
	}
}
}
