package com.bridgelabz;

import java.util.Scanner;

public class MaximumNumber
{
	static int maxProduct(int[] array,  int n)
	{
		int maxProduct = 0;
		for(int i=0; i < n-1; i++)
			for(int j = i + 1; j < n; j++)
				maxProduct = Math.max(maxProduct, array[i]*array[j]);
		return maxProduct;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int n = array.length;
		System.out.println("Enter the Elements of an Array: ");
		for (int i =0; i < size; i++)
		{
			array[i] =scanner.nextInt();
		}
		scanner.close();
		System.out.println("Maximum Product of Two Numbers are : " +maxProduct(array, n));
	}

}
