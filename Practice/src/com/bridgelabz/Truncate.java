package com.bridgelabz;

import java.lang.String;
public class Truncate {

	public static String truncateString(String s, int length){
		if (s.length() > length) {
		return s.substring(0, length);
		}
		return s;
	}
		public static void main(String args[]) 
		{
		String s = "Java programming language";
		
		String result = truncateString(s, 8);
		System.out.println(result);
	}
}
