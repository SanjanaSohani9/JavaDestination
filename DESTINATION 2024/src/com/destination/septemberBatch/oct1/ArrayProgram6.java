package com.destination.septemberBatch.oct1;

import java.util.Scanner;

/*
 * 2- Dimenssion Jagged Array
 */
public class ArrayProgram6 {
  int arr[][];
  int clss;
  Scanner sc = new Scanner(System.in);
  void CreateArray(int n) {
	  clss = n;
	  arr = new int[n][];
	  System.out.println("Collecting student count for each student :");
	  for(int i=0;i<arr.length;i++) {
		  System.out.println("enter the student count inside class no :"+(i+1));
		  int stu = sc.nextInt();
		  arr[i] = new int[stu];
	  }
	  System.out.println("Array is created Successfully");
	  System.out.println("=======================");
  }
  void addData() {
	  System.out.println("Collecting array data :");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Inside class no :"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the marks of student no :"+(j+1));
			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println("marks successfully collected");
	System.out.println("===========================");
  }
  void Display() {
	  System.out.println("Display array Data");
	  for(int i=0;i<arr.length;i++) {
		  System.out.println("Inside class no :"+(i+1));
		  for(int j=0;j<arr[i].length;j++) {
			  System.out.println("the marks of student no :"+(j+1)+"is :"+arr[i][j]);
		  }
	  }
  }
  public static void main(String[] args) {
	ArrayProgram6 a6 = new ArrayProgram6();
	Scanner sc = new Scanner(System.in);
	int cls = sc.nextInt();
	a6.CreateArray(cls);
	a6.addData();
	a6.Display();
}
}
