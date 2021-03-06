package com.bridgelabz;

import java.util.Scanner;

public class ExcelColumnTitle {

	static void excelColumnTitle(int columnNumber) {
		StringBuilder columnName = new StringBuilder();
		while (columnNumber > 0) {
			int reminder = columnNumber % 26;
			
			if (reminder == 0) {
				columnName.append("Z");
				columnNumber =  columnNumber / 26  ;
			}
			else {
				columnName.append((char)((reminder - 1) + 'A'));
				columnNumber = columnNumber / 26;
			}
		}
		System.out.println(columnName.reverse());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int columnNumber = scanner.nextInt();
		excelColumnTitle(columnNumber);
		scanner.close();
	}

}//creating an instance of map using hashmap.
