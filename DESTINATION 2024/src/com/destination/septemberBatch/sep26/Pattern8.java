package com.destination.septemberBatch.sep26;

import java.util.Scanner;

/*
 * 25 24 23 22 21
 * 20 19 18 17 16
 * 15 14 13 12 11
 * 10  9  8  7  6
 * 5   4  3  2  1
 */
public class Pattern8 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();
	int m =n*n;
	
	for(int i=1; i<=n;i++){
		 //inner loop
		for(int j=1;j<=n;j++) {
			System.out.print(m);
			System.out.print("	");
			m--;
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
