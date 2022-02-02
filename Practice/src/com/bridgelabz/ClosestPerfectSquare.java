package com.bridgelabz;

import java.util.Scanner;

public class ClosestPerfectSquare 
{

	static int reverseANumber(int number)
	{
		int reverse = 0;
		while(number != 0)
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;
		}
		System.out.println("Reverse of a Number is: " +reverse);
		
		return reverse;
	}
	public static int getNearestSquare(int number)
	{
		int squareRoot = getSquareRoot(number);
		if ((number - (squareRoot * squareRoot)) < ((squareRoot + 1)
				* (squareRoot + 1) - number))
			return squareRoot * squareRoot;
		else
			return (squareRoot + 1) * (squareRoot + 1);
	}

	public static int getSquareRoot(int number) 
	{
		if (number == 0 || number == 1)
			return number;
		int start = 1, end = number / 2, answer = 0;
		while (start <= end)
		{
			int middle = start + (end - start) / 2;
			int square = middle * middle;
			if (square == number)
				return middle;
			else if (square < number)
			{
				start = middle + 1;
				answer = middle;
			} 
			else
				end = middle - 1;
		}
		return answer;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int reverse = reverseANumber(number);
		System.out.println("The Nearest Perfect Square is: " +getNearestSquare(reverse));
		scanner.close();
	}

}
