package com.javase8.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PanCard Details : ");
		String panCard= sc.next();
		panCard = panCard.toUpperCase();
		if(inputValidation(panCard)) {
			System.out.println("PanCard Validated : " + panCard);
			System.out.println("The PanCard is Valid and ReArranged : " + arrangeAlphanumerics(panCard));
		}
		
		else {
			System.out.println("Invalid PanCard ID");
		}
		sc.close();
	}

	public static boolean inputValidation(String panCard) {
		
		if((panCard.length() == 10)&&(panCard.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+$")))
			return true;
		return false;
	}

	public static String arrangeAlphanumerics(String panCard) {
		
		char[] panCardArray = panCard.toCharArray();	//Converting the String to Character Array for Sorting
		// for(int i=0; i<panCardArray.length;i++)
		//	System.out.println(panCardArray[i]);
		
		Arrays.sort(panCardArray);						// Sorting the panCard Array
		
		panCard = new String(panCardArray);
		
		// System.out.println(panCardArray);
		
		String panCardAlpha = panCard.replaceAll("[^a-zA-Z ]", "");
		String panCardNumeric = panCard.replaceAll("[^0-9 ]", "");
		
//		System.out.println("PanCard Numeric Value : "+ panCardNumeric);
//		System.out.println("PanCard Alphabet Value : "+ panCardAlpha);
		
		StringBuilder reverseString = new StringBuilder(panCardAlpha);	
		
		reverseString.reverse();
		
		panCardAlpha = reverseString.toString();
		
//		System.out.println("Reversed PanCard Alphabet Value : "+ panCardAlpha);
		
		return panCardNumeric + panCardAlpha;
	}	
}


