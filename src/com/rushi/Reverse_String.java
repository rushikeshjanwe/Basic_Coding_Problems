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
	
	public static void main(String[] args) {
		reverse_String("Rushikesh");
		//simpler_way("Rohan");
	}
	

}
