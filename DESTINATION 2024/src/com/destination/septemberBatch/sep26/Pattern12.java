package com.destination.septemberBatch.sep26;

import java.util.Scanner;

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
public class Pattern12 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n= sc.nextInt();
	
	for(int i=1; i<=n;i++) {
		//inner loop
		for(int j=1;j<=i;j++) {
			System.out.print(j);
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
