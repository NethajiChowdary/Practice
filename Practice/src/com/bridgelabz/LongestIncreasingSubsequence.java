package com.bridgelabz;


import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static int longestIncreasingSubsequence(int[] array , int i , int n, int previous) {
		if ( i == n) {
			return 0;
		}
		int exclude = longestIncreasingSubsequence(array, i + 1, n, previous);
		
		int include = 0;
		if (array[i] > previous) {
			include = 1 + longestIncreasingSubsequence(array, i + 1, n, array[i]);
		}
		return Integer.max(include, exclude);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array; ");
		int size = scanner.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the elements of array; ");
		for(int i =0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("The length of Longest Increasing Subsequence is: " + longestIncreasingSubsequence(array, size, array.length, Integer.MAX_VALUE));
	}

}
