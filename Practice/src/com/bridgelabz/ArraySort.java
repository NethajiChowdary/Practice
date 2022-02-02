package com.bridgelabz;

import java.util.Scanner;

public class ArraySort
    {
        public static void main(String args[])
        {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter the Sentence");
            String str = scanner.nextLine();
            String[] str1 = str.split("\\s");
            scanner.close();
            for(int i =0; i < str1.length; i++)
            {
            	for(int j = i+1; j < str1.length; j++)
            	{
            		if(str1[i].length()<str1[j].length())
            		{
            			String temp = str1[i];
            			str1[i] = str1[j];
            			str1[j] = temp;
            		}
            	}
            }
            for(int i=0; i<str1.length; i++)
            {
            	System.out.println(str1[i] +"");
            }
             int res =0, curr_len =0;
             for(int i=0; i < str.length(); i++)
             {
            	 if(str.charAt(i) != ' ')
            		 curr_len++;
            	 else
            	 {
            		 res = Math.max(res, curr_len);
            		 curr_len = 0;
            	 }
             }
             System.out.println("Longest Word is :" +curr_len);
        }
    }
