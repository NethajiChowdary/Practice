package com.bridgelabz;

import java.util.Scanner;

public class CountVowels 
{

	public static void main(String[] args)
	{
		int count = 0;
		System.out.println("Enter the string: ");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		scanner.close();
		for (int i =0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				count++;
			}
		}
		System.out.println("Number of vowels in the string is: " +count);	
	}

}
