package com.destination.septemberBatch.oct1;
/*
 * 2 - Dimession Array 
 */
import java.util.Scanner;


	class ArrayOperation2{
		int arr[][];
		int cls;
		int stu;
		void createArray(int n,int m) {
			cls =n;
			stu =m;
			arr = new int [n][m];
			System.out.println("Array is created succesfully");
			System.out.println("==================");
		}
		
		void addData() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Collection array Data");
				for(int i=0;i<cls ;i++) 
				{
					System.out.println("Enter the marks of the student no : "+(i+1));
				     for(int j=0;j<stu;j++) {
				    	 arr[i][j] = sc.nextInt();
					
				}
			}
			System.out.println("Marks successfully collected");
		
		}	

		void display() {
			System.out.println("Display array Data :");
			for(int i=0;i<cls ;i++) {
				System.out.println("Enter the marks of the student no : "+(i+1));
				for(int j=0;j<stu;j++) {
					System.out.println("Enter the marks of student no :"+(j+1)+" is = "+arr[i][j]);
		}
	}
    }
}
			public class ArrayProgram2{
				public static void main(String[] args) {
					ArrayOperation2 ao2 = new ArrayOperation2();
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the class count :");
					int cls = sc.nextInt();
					System.out.println("Enter the student count ");
				    int stu = sc.nextInt();
				    ao2.createArray(cls, stu);
				    ao2.addData();
				    ao2.display();
				}
			}
	
