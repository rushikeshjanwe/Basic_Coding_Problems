package com.rushi;

public class Factorial {
	
	 static int factorial(int n) {
		 int result=1;
		 
		 for(int i=1;i<=n;i++) {
			  result=result*i;
		 } 
		 System.ou.println(result);
		 return result;
	 }
	
	public static void main(String[] args) {
		factorial(10);
	}

	}

