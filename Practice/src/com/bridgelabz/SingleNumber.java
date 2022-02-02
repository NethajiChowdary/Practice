package com.bridgelabz;

import java.util.Scanner;

public class SingleNumber 
{
	static int singleNumber(int Array[], int size) 
	{
		int result = Array[0];
		for(int i=1; i < size; i++)
			result = result ^ Array[i];
		return result;
	}
   public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size =  scanner.nextInt();
		int[] Array = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i =0; i<size;i++)
		{
			Array[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Element Appearing once is : " + singleNumber(Array, size) );	
	}	
}
