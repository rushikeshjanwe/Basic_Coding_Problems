package com.rushi;

public class PrimeNo {
	
	

     static boolean isPrime(int n) {
    	
    	 if(n<=1) {
    		 System.out.println("Both 0 & 1 are not prime numbers");
    	 }
    
    	 for(int i=2;i<=Math.sqrt(n);i++) {
    		 if(n%i==0) {
    			 return false;
    		 }
    	 }
    	
    	 
    	 return true;
    }

     
     public static void main(String[] args) {
		int limit=15;
		
		for(int i=2;i<=limit;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		
		}
	}
}
