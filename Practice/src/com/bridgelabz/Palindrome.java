package com.bridgelabz;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String original  = scanner.next();
		int length = original.length();
		scanner.close();
		isPalindrome( original, length);
	}	
		public static void isPalindrome( String original, int length)
		{
			String reverse = "";
		for (int i = length - 1; i >= 0; i--)
		  reverse = reverse + original.charAt(i);
		if(original.equals(reverse))
			System.out.println("Entered String is Palindrome");
		else
			System.out.println("Entered String is not Palindrome");
		 
		}
	
}
