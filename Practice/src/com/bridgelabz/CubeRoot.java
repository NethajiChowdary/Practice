package com.bridgelabz;

import java.util.Scanner;

public class CubeRoot 
{
	static void cubeRoot(int n)
	{
		double i , precision = 0.000001;
		for(i =1; (i*i*i) <= n; ++i);
			for(--i; (i*i*i) < n; i += precision);
				System.out.println("Cube root is " +i);
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = scanner.nextInt();
		cubeRoot(n);
		scanner.close();
	}

}
