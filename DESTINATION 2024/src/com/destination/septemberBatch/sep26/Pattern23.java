package com.destination.septemberBatch.sep26;

import java.util.Scanner;

/*
 * 01 	02 	03 	04 	05
 * 06 	07 	08 	09 	10
 * 011	012	013	014	015
 * 016	017	018	019	020
 * 021	022	023	024	025
 */
public class Pattern23 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the size");
     	int  n = sc.nextInt();
     	int count = 1;
     	 	for(int i=0;i<n;i++) { 
   	        //inner loop 
     	 		for(int j=0;j<n;j++) {
     	 			if(count<10) {
     	 			System.out.print("0"+count+" "); 
     	 			}
   		   
     	 		else {
   			   System.out.print(count+" ");
   		   }
     	 		
     	 			count++;
     	 		}
   		   System.out.println();
   		
     	 	}
    }
}
   	
	

