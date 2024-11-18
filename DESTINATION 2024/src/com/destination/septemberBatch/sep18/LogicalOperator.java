package com.destination.septemberBatch.sep18;

public class LogicalOperator {
  public static void main(String[] args) {
	int a=10;
	int b=100;
	int c=1000;
	System.out.println("Logical Operator Example");
	boolean res1 =(a>5 && b<150 && c<200);
	System.out.println(res1);
	System.out.println("========================");
	
	System.out.println("Logical Operator Example");
	boolean res2 =(a>5  || b<150 || c<200);
	res2 = (a>100 || b>150|| c<200);
	System.out.println(res2);
	System.out.println("========================");
}
}
