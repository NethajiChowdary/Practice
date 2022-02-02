package com.bridgelabz;

import java.util.Scanner;

public class CountCharacter 
{

	public static void main(String[] args)
	{
		int count[] = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String n = scanner.nextLine();
		int length = n.length();
		
	for (int i = 0; i < length; i++ )
		{
			 count[(int) n.charAt(i)] ++;
		}
	}
	
}
