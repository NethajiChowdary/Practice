package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int ArraySize = scanner.nextInt();
		int[] values = new int[ArraySize];
		System.out.println("Enter the elements of the array:");
		for (int i=0; i<ArraySize; i++) {
			values[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("The Prime Numbers are:");
		for (int i=0; i<ArraySize; i++) {
			if (checkprime(values[i])) {
				System.out.println(values[i]);
			}
		}
	}
	public static boolean checkprime(int n) {
		if (n<=1)
			return false;
		int i =2;
		while(i<=n/2) {
			if ((n%i)==0)
				return false;
			i++;
		}
		return true;
	}
}