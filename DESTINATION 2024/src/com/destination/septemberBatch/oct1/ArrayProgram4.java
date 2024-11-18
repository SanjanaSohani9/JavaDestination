package com.destination.septemberBatch.oct1;
/*
 * 3-Dimenssion  Jagged Array
 */
import java.util.Scanner;

public class ArrayProgram4 {

	String arr [][][];
	int clg;
	int cls;
	Scanner sc = new Scanner(System.in);
	void createArray(int n) {
		
		clg =n;
		arr = new String [clg][][];
		System.out.println("Collection college count for each class :");
		System.out.println("=====================");
	}
	
	void addData() {
			System.out.println("Collection array Data");
			for(int i=0;i<arr.length ;i++) 
			{
				System.out.println("inside college no : "+(i+1));
				System.out.println("enter the no of class");
			     int cls = sc.nextInt();
			     arr[i] = new String [cls][];
			     for(int j=0;j<arr[i].length;j++) {
			    	 	System.out.println("enter the no of student class :"+(j+1));
			    	 	int stu = sc.nextInt();
			    	 	arr[i][j]= new String [stu];
			      for(int k=0;k<arr[i][j].length;k++) {
			    		 System.out.println("enter the number of student :"+(k+1));
			    		 arr[i][j][k]=sc.next();
			    		 
			    	 }
			     }
		}
		System.out.println("successfully collected");
	    System.out.println("==============================");
	}	

	void display() {
	
		for(int i=0;i<arr.length ;i++) {
			System.out.println("inside class no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("name of student no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("student:"+(k+1)+"name ="+arr[i][j][k]);
				}
	  }
    }
  }

		
			public static void main(String[] args) {
				ArrayProgram4 ao4 = new ArrayProgram4();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter college");
				int n = sc.nextInt();
				ao4.addData();
			    ao4.display();
			}
		}

