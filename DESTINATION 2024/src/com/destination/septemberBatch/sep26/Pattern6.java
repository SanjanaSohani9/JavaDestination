package com.destination.septemberBatch.sep26;

import java.util.Scanner;

/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
public class Pattern6 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	 for(int i=1;i<=n;i++) {
		 for(int j=1; j<=n;j++) {
			 System.out.print(i);
			 
		 }
		 System.out.println();

	}
}
}
