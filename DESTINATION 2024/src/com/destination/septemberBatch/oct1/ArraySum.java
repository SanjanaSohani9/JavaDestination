package com.destination.septemberBatch.oct1;

import java.util.Scanner;

public class ArraySum {
       public static void main(String[] args) {
		//int arr [];
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int arr []=new int[n];
		for(int i=0;i<arr.length;i++) {
		  arr[i] =sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
       
}
