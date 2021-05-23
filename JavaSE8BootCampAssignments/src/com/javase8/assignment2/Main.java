package com.javase8.assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		
		if(n<1) {
			System.out.println("Enter valid row number !!!!");
			sc.close();
			return;
		}
		
		int totalNumberofBirds = countTotalBirds(n);
		
		System.out.println("Total Number of Birds are : ");
		System.out.println(totalNumberofBirds);
		
		sc.close();
	}

	public static int countTotalBirds(int rowNumber) {
		
		if(rowNumber == 1)
			return 1;
		
		if(rowNumber == 2)
			return 3;
		
		int prevRow = 1, currRow = 2;  // Variables to store the number of birds in previous row and current row.
		int totalNumberofBirds = prevRow + currRow;	 // Variable sum holds the total number of birds so far.
		int rows = 3;
		
		while(rows <= rowNumber) {
			int nextRow = prevRow + currRow;	//Variable nextRow stores the number of birds in the nextRow.
			prevRow = currRow;
			currRow = nextRow;
			totalNumberofBirds = totalNumberofBirds + nextRow;
			rows++;
		}
		
		return totalNumberofBirds;
	}
	
}
