package com.bridgelabz;

import java.util.Scanner;

public class ReverseAlternateCharacter 
{
	static String reverseAlternateCharacter(String stringName , int k)
	{
		for(int i =0; i < stringName.length();)
		{
			if(i + k > stringName.length())
				break;
			stringName = stringName.substring(0 , i) + new String(new StringBuilder(
					stringName.substring(i, i + k)) . reverse()) +
					stringName.substring(i + k);
					i += 2 * k;
		}
		return stringName;
		
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String stringName = scanner.nextLine();
		System.out.println("Enter the Number: ");
		int k = scanner.nextInt();
		System.out.println(reverseAlternateCharacter(stringName, k));
		scanner.close();
	}

}
