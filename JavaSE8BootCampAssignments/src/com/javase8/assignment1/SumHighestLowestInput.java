package com.javase8.assignment1;

import java.util.Scanner;

public class SumHighestLowestInput {

	   public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the size of the inputs : ");
	       
		    int n = sc.nextInt();   //Reads the number of elements in the series
		        
		        if(n<4) {
		        	System.out.println("Wrong Input. Please Enter a number greater than 3");
		        }
		        
		        else {
		        	int lowest = 0, highest =0;
		        	System.out.println("Enter the numbers");
		        	int number = sc.nextInt();
		        	lowest = number;
		        	highest = number;
		        	while(n>1) {
		        		number = sc.nextInt();
		        		if(lowest > number)
		        			lowest = number;
		        		if(highest < number)
		        			highest = number;
		        		n--;
		        	}
		        	int sum = lowest + highest;
		        	System.out.println("Sum of lowest and highest number in the inputs is : ");
		        	System.out.println(sum);
		        }
	}
	
}
