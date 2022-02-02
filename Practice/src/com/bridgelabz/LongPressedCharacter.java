package com.bridgelabz;

import java.util.Scanner;

public class LongPressedCharacter
{
	public  boolean isLongPressedName(String name, String typed)
	{
        int i = 0, j = 0;
        while (true) 
        {
            if (name.length() ==  i && typed.length() == j) 
            	return true;
            else if (j >= typed.length())
            	return false;
            else if (i < name.length() && name.charAt(i) == typed.charAt(j))
            {
                i++; j++;
            }
            else if (i!=0 && typed.charAt(j) == name.charAt(i-1)) j++;
            else 
            	return false;
        }
    }

    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the name: ");
    	String name = scanner.next();
    	System.out.println("Enter typed name: ");
    	String typed = scanner.next();
        LongPressedCharacter longPressedName = new LongPressedCharacter();
        System.out.println(longPressedName.isLongPressedName(name, typed)); 
        scanner.close();
//        System.out.println(longPressedName.isLongPressedName("saeed", "ssaaedd"));  
//        System.out.println(longPressedName.isLongPressedName("leelee", "lleeelee"));    
//        System.out.println(longPressedName.isLongPressedName("laiden", "laiden"));  
//        System.out.println(longPressedName.isLongPressedName("vtkgn", "vttkgnn")); 
    }

}
