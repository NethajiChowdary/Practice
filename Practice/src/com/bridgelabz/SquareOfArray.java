package com.bridgelabz;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class SquareOfArray 
{
	
	static void squareOfArray(int[] array )
	{
		int n = array.length;
		for(int i =0; i < n; i++)
			array[i] = array[i] * array[i];
		Arrays.sort(array);
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int n = array.length;
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i < size; i++)
		{
			array[i] = scanner.nextInt();
		}
		System.out.println("Before Sort ");
		for (int i =0 ; i< n; i++)
			System.out.print(array[i] + " ");
		squareOfArray(array);
		System.out.println(" ");
		System.out.println("After Sort ");
		for ( int i =0; i < n; i++)
			System.out.print(array[i] + " ");
		scanner.close();
	}

}
