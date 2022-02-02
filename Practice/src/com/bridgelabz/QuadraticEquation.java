package com.bridgelabz;

import java.util.Scanner;

public class QuadraticEquation 
{
	public static void quadraticEquation(double a, double b, double c)
	{
		double discriminant = (b*b) - (4*a*c) ;
		if(discriminant > 0)
		System.out.println(discriminant + " Roots are real");
		else
			System.out.println(discriminant + " Roots are imaginary");
		if(discriminant > 0)
		{
			double root1 = -b + (Math.sqrt(discriminant))/2*a;
			double root2 = -b - (Math.sqrt(discriminant))/2*a;
			System.out.println("Roots of the quadratic equation are " + root1 + "," + root2);
		}
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values of a , b , c : ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		quadraticEquation(a, b, c);
		scanner.close();
	}

}
