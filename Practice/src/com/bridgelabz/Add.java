package com.bridgelabz;

class Adder
{
	public static int add (int a , int b)
	{
		return a+b;
	}
	public static int add(int a, int b , int c) 
	{
		return a+b+c;
	}
}

public class Add 
{

	public static void main(String[] args) 
	{
		System.out.println(Adder.add(5, 8));
		System.out.println(Adder.add(8, 5, 9));
	}

}
