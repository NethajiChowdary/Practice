package com.bridgelabz;

import java.util.Scanner;

public class TwoDimensionalArray 
{
	static int twoDimensionalArray(int num , int row, int column) 
	{  
		int[][] twoD = new int[row][column];
		for(int i = 0; i <= num; i++)
		{
			for( row = 0; row <= num; row++)
			{
				for(column = 0; column <= num; column++)
				{
					System.out.println( twoD[row][column]+ "");
				}
			}
			System.out.println(i);
		}
		return 0;
		
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt();
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		//int twoD[][] = new int[row][column];
		twoDimensionalArray(num, row, column);
		scanner.close();
	}

}
