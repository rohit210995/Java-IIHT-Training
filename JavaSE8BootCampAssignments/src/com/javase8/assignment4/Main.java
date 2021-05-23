package com.javase8.assignment4;

import java.util.Scanner;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The IP Address : ");
		String ipAddress = sc.nextLine();
		
		if(checkIPAddress(ipAddress)) {
			System.out.println("Valid IP Address !!!!");
		}
		else {
			System.out.println("Invalid IP Address");
		}
	}

	public static boolean checkIPAddress(String ipAddress) {
		
		 // Regex for digit from 0 to 255.
        String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
  
        // Regex for a digit from 0 to 255 and
        // followed by a dot, repeated 4 times.
        String regexIP = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
  
        // Compile the ReGex
        Pattern ipPattern = Pattern.compile(regexIP);
		
        if(ipAddress!=null){
        	
        	Matcher ipMatch = ipPattern.matcher(ipAddress);
        	
        	return ipMatch.matches();
        }
        return false;
	}
}
