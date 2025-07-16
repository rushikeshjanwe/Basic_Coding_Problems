package com.rushi;

public class Reverse_String {

	
	static void reverse_String(String name) {
		
		
		char result;
		
		
		for(int i=name.length()-1; i>=0;i--) {
			char charAt = name.charAt(i);
			result=charAt;
			System.out.print(result);
		}
				
	}
	
	static void simpler_way(String name) {
		String reversed = new StringBuilder(name).reverse().toString();
		System.out.println(reversed);
	}
	
	//Leetcode Question 2443
	
	 public boolean sumOfNumberAndReverse(int num) {
	        
		   for (int i = 0; i <= num; i++) {
		            if (i + reverse(i) == num) {
		                return true;
		            }
		        }
		        return false;
		    }

		    private int reverse(int n) {
		        int rev = 0;
		        while (n > 0) {
		            rev = rev * 10 + n % 10;
		            n = n / 10;
		        }
		        return rev;
		    }
		    
	public static void main(String[] args) {
		reverse_String("Rushikesh");
		//simpler_way("Rohan");
		Reverse_String r = new Reverse_String();
		r.sumOfNumberAndReverse(121);
	}
	

}
