package com.bridgelabz;

import java.util.Scanner;

public class DivisorsOfANumber {

	public static void divisorsOfANumber(int number) {
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				System.out.print(" " + i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Positive Number: ");
		int number = scanner.nextInt();
		divisorsOfANumber(number);
		scanner.close();
	}
	

}
