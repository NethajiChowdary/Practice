package com.bridgelabz;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentMain 
{
	public static void main(String[] args) 
	{
		LinkedList<StudentMain> list = new LinkedList<StudentMain>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Options 1 , 2 , 3: ");
		char options = scanner.next().charAt(0);
		scanner.close();
		
		switch (options) 
		{
		case '1':
			
			break;

		default:
			break;
		}
	}
}
