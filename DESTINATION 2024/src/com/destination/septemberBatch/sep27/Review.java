package com.destination.septemberBatch.sep27;

import java.util.Scanner;

/*
 * review for java
 */
public class Review {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++){
		//inner loop
		for(int j=1;j<=n;j++) {
			if(i==0 || i==(n-1)){
				System.out.print("# ");
			}else {
				System.out.print("  ");
			}
		}
	}
}
}
