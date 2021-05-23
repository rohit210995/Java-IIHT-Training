package com.javase8.assignment3;

import java.util.Scanner;

public class RomanToDecimal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Roman Number : ");
		String romanNumber = sc.nextLine();
		
		int intNumber = romanToDecimal(romanNumber);
		
		System.out.println("The equivalent integer is : ");
		System.out.println(intNumber);
		
		sc.close();

	}
	
	public static int romanToDecimal(String romanNumber) {
		
		int number = 0;
		
		 for (int i = 0; i < romanNumber.length(); i++)
		    {
		        
		        int s1 = value(romanNumber.charAt(i));  // Getting value of symbol s[i]

		        
		        if (i + 1 < romanNumber.length())		// Getting value of symbol s[i+1]
		        {
		            int s2 = value(romanNumber.charAt(i + 1));

		            if (s1 >= s2)	// Comparing both values
		            {
		            	number = number + s1;
		            }
		            else
		            {
		                number = number + s2 - s1;
		                i++;
		            }
		        }
		        else {
		            number = number + s1;
		        }
		    }
		return number;
	}
	
	public static int value(char ch)
	{
	    if (ch == 'I' || ch == 'i')
	        return 1;
	    if (ch == 'V' || ch == 'v')
	        return 5;
	    if (ch == 'X' || ch == 'x')
	        return 10;
	    if (ch == 'L' || ch == 'l')
	        return 50;
	    if (ch == 'C' || ch == 'c')
	        return 100;
	    if (ch == 'D' || ch == 'd')
	        return 500;
	    if (ch == 'M' || ch == 'm')
	        return 1000;
	    return -1;
	}

}
