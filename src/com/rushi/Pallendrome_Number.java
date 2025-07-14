package com.rushi;

public class Pallendrome_Number {
	
	static boolean isPalindrome(int number) {
        if (number < 0) {
            System.out.println("Negative numbers are not considered palindromes: " + number);
            return false;
        }

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println("It is a Palindrome: " + original);
            return true;
        } else {
            System.out.println("It is NOT a Palindrome: " + original);
            return false;
            
        }
    }

    public static void main(String[] args) {
        isPalindrome(-121);  // Not a palindrome
        isPalindrome(121);   // Palindrome
        isPalindrome(123);   // Not a palindrome
    }
}