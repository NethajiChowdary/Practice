package com.bridgelabz;

import java.util.Scanner;

public class RepeatingNumber 
{
	public static void maximumRepeatingElement(int array[] , int n )
	{
		int maxCounter = 0;
		int element = 0;
		for(int i = 0;  i < n; i++)
		{
			int counter = 1;
			for (int j = i+1; j < n; j++)
			{
				if(array[i] == array[j])
				{
					counter ++;
				}
					
			}
			if(maxCounter<counter)
			{
				maxCounter = counter;
				 element = array[i];
			}
		}
		System.out.println("Element repeating maximum no of times is: " + element + " , maximum count is: " + maxCounter);
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the elements of an array: ");
		for(int i = 0; i < n ;i++)
		{
			array[i] = scanner.nextInt();
		}
		maximumRepeatingElement(array, n);
		scanner.close();
	}

}
