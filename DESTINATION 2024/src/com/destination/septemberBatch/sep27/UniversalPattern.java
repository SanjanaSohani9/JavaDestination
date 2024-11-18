package com.destination.septemberBatch.sep27;

import java.util.Scanner;

public class UniversalPattern {
 public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	for(int i=0;i<n;i++) {
		//inner loop
		for(int j=0;j<n;j++) {
			if(i==0) {
				System.out.print("# ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
