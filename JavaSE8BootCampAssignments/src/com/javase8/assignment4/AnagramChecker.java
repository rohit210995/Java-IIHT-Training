package com.javase8.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String stringOne = sc.nextLine();
		System.out.println("Enter Second String : ");
		String stringTwo = sc.nextLine();
	
		String stringOneLower = stringOne.toLowerCase();
		String stringTwoLower = stringTwo.toLowerCase();
		
		stringOneLower = stringOneLower.replaceAll("\\s+","");
		stringTwoLower = stringTwoLower.replaceAll("\\s+","");
		
		System.out.println(stringOneLower);
		System.out.println(stringTwoLower);
				
		//Creating Character Arrays for comparison
		char[] stringOneCharArray = stringOneLower.toCharArray();
		char[] stringTwoCharArray = stringTwoLower.toCharArray();
		
		//Checking if strings are Anagrams
		//NOTE The reason behind comparing the lengths first is that 
		// if the lengths are not same then there's no point in checking
		// for equality of two strings. Therefore, we are 
		// shortCircuiting our If condition
		if((stringOneCharArray.length == stringTwoCharArray.length) && (isAnagram(stringOneCharArray, stringTwoCharArray))) {
			System.out.println(stringOne);
			System.out.println(stringTwo);
			System.out.println("The two strings are Anagrams of Each Other");
		}
		else {
			System.out.println("The String are not Anagrams of each other");
		}
	}

	public static boolean isAnagram(char[] stringOne, char[] stringTwo) {

		// Sorting the two character Arrays based on their UniCode to perform comparison
		Arrays.sort(stringOne);
		Arrays.sort(stringTwo);
		
		int i = 0, j = 0;
		
		while(i < stringOne.length && j < stringTwo.length) {
			if(stringOne[i] != stringTwo[j])
				return false;
			i++;
			j++;
		}
		return true;
	}
}
