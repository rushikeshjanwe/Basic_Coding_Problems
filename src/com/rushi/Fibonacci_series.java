package com.rushi;

public class Fibonacci_series {

	static void fibonacci(int n) {
		
		int a=0;
		int b=1;
		
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");  //1
			
			int next=a+b; //0+1=1
			a=b; // a=1
			b=next; //b=1

			
		}
		
	}
	public static void main(String[] args) {
		fibonacci(10);
	}
}
