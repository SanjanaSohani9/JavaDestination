package com.destination.septemberBatch.oct1;
/*
 * 3 Dimenssion Array 
 */
import java.util.Scanner;

public class ArrayProgram3 {

	String arr[][][];
	int cls;
	int stu;
	int clg;
	Scanner sc = new Scanner(System.in);
	
	void createArray(int m,int n,int o) {
		arr = new String[m][n][o];
		System.out.println("Array is created succesfully");
		System.out.println("==================");
	}
	
	void addData() {
			System.out.println("Collection array Data");
			for(int i=0;i<arr.length ;i++) 
			{
				System.out.println("Inside clg no : "+(i+1));
			     for(int j=0;j<arr[i].length;j++) {
			    	 System.out.println("onside class no:" +(j+1));
			    	 for(int k=0;k<arr[i][j].length;k++) {
			    		 System.out.println("enter the name of student no :"+(k+1));
			    		 arr[i][j][k] = sc.next();
			    	 }
			     }
			}
	             System.out.println("Name successfully collected");
			    System.out.println("======================");	 
	    }	

	void display() {
		System.out.println("Display array Data :");
		for(int i=0;i<arr.length ;i++) {
			System.out.println("inside clg  no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					
				}
	  }
    }
  }

		
			public static void main(String[] args) {
				ArrayProgram3 ao3 = new ArrayProgram3();
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the clg count :");
				int m = sc.nextInt();
				System.out.println("Enter the class count :");
				int n = sc.nextInt();
				System.out.println("Enter the student count :");
				int o = sc.nextInt();
			
			    ao3.createArray(m, n, o);
			    ao3.addData();
			    ao3.display();
			}
		}



