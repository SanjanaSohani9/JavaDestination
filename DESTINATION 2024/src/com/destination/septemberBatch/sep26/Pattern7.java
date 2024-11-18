package com.destination.septemberBatch.sep26;

import java.util.Scanner;

/*
 * 1  2  3  4  5
 * 6  7  8  9  10
 * 11 12 13 14 15
 * 16 17 18 18 20
 * 21 22 23 24 25
 */
public class Pattern7 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();
	int m =1;
	for(int i =1;i<=n ;i++) {
		 //inner loop
		for(int j=1;j<=n;j++) {
			System.out.print(m);
			System.out.print(" ");
			m++;
		}
		System.out.println();
	}
}
}
