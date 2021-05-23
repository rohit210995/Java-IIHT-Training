package com.javase8.assignment1;

import java.util.Scanner;

public class PalindromeUptoSum {

	   public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the size of the inputs : ");
	       
		    int n = sc.nextInt();   //Reads the number of elements in the series
		        
		        if(n<11) {
		        	System.out.println("Invalid Input. Please Enter a number greater than 11");
		        }
		        
		        else {
		        	
		        	int sequence = 11;
		        	
		        	while(sequence < n)
		        	{
		        		if(isPalindrome(sequence))
		        		{
		        			System.out.println(sequence);
		        		}
		        		sequence++;
		        	}
		        	
		        }
	}
	   
	   public static int reverse(int num) 
	    { 
	        int rev = 0; 
	        while (num > 0) 
	        { 
	            rev = rev * 10 + num % 10; 
	            num = num / 10; 
	        } 
	        return rev; 
	    } 
	   
	   public static boolean isPalindrome(int n)
	   {
		   if(n == reverse(n))
			   return true;
		   return false;
	   }
}
