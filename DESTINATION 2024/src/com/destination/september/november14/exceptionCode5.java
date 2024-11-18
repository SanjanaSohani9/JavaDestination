package com.destination.september.november14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionCode5 {
 public static void main(String[] args) {
	 try {
			System.out.println("division operation generated");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the numerator");
			int num = sc.nextInt();
			System.out.println("enter the denomenator");
			int den = sc.nextInt();
			
			int res = num/den;
			System.out.println("Division operation is completed");
			System.out.println("=========================");
			
			
			System.out.println("Array operation stared" );
			System.out.println("enter the array size");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("enter the position number to add the data");
			int pos = sc.nextInt();
			System.out.println("enter the value to be added");
			int val = sc.nextInt();
			arr [pos] = val;
			System.out.println("data added...");
			System.out.println("Exception handeled....");
			
	}catch(ArithmeticException e1) {
		 System.out.println("Arithmetic Exception Generated");
	 }catch(ArrayIndexOutOfBoundsException  |NegativeArraySizeException e2) {
		 System.out.println("Array Index Out Of Bounds Exception Generated  or Negative Array Size Exception Generated");
	 
	 }catch(InputMismatchException e3) {
		 System.out.println("Input Mismatch Exception Generated");
	 }
	 //generic catch block/universal catch block
	 catch(Exception e) {
		 System.out.println("Exception handeled");
	 }
}
}
