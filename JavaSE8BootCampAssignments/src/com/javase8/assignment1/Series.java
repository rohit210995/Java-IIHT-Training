package com.javase8.assignment1;

import java.util.Scanner;

public class Series {

	    public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the number of Elements in the Series : ");
	       
		    int n = sc.nextInt();   //Reads the number of elements in the series
		        
		        if(n>0) {
		        	// Series: 
			        //      if n = 5
			        //      2, 6, 12, 20, 30,....
			        
			        int j = 0, k=2;              //To calculate the series
			        
			        for(int i = 0; i<n; i++){
			            
			            j+= k;
			            System.out.println(j);
			            k+= 2;	
			        }
		        }
		        
		        else {
		        	System.out.println("Wrong Input. Please Enter a valid positive number");
		        }
	}
}