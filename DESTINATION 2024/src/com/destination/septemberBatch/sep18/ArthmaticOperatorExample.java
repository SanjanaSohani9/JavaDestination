package com.destination.septemberBatch.sep18;

	 class ArithmaticOperator{
		
		void add(int a ,int b) {
			int res1 =a+b;
			System.out.println("Addition result is ="+ (res1));
			System.out.println("===============");
		}
		void sub(int a, int b) {
			int res2 = a-b;
			System.out.println("Substraction result is ="+(res2));
		} 
		void mul(int a ,int b) {
			int res3 =a*b;
			System.out.println("Multiplication result is"+(res3));
		}
		void dic(int a,int b) {
			int res4=a/b;
			System.out.println("Division result is ="+(res4));
			System.out.println("================");
		}
		void mod(int a, int b) {
			int res5= a%b;
			System.out.println("modulud result is ="+(res5));
			System.out.println("===================");
			}
	}
	public class ArthmaticOperatorExample {
     public static void main(String[] args) {
		System.out.println("======Arithmatic Operator Example =====");
		int a =100;
		int b= 50;
		ArithmaticOperator ao = new ArithmaticOperator();
		ao.add(a, b);
		ao.sub(a, b);
		ao.mul(a, b);
		ao.dic(a, b);
		ao.mod(a, b);
	}
     
	
	}

