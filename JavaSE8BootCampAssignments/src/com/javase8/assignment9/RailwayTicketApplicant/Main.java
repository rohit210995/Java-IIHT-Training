/**
 * class Main with the following methods:-
 * 
 * public static Passenger fareCalculation(Passenger passenger, int normalFare)
	 * if the age is 65 or higher 35% rebate will be applicable.
	 * If the age is 14 or below 45% rebate will be applicable.
 * 	  
 * public static void main(String []arg)-> It will accept from location, to location, normal fare 
	 * (assume that trains having same class only). Then it will accept number of passengers (must be between 1-6) 
	 * finally accept each passenger’s name and age in a comma separate string (e.g: Tom,37)
	 * Each passenger details will be converted into Passenger object
	 * calculate individual fare applicable based on age and stored in a list. 
	 * Finally displays the form location, to location, each passenger details like name, age & fare and calculate total amount payable
 * 
 */
		
package com.javase8.assignment9.RailwayTicketApplicant;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fromLocation, toLocation, passengerName, displayDetails;
		int normalFare, passengerAge, numberOfPassengers;
		int totalFare = 0;
		
		Passenger[] passengerList = new Passenger[6];
		
		System.out.println("Enter the Number of passengers (between 1 to 6) : ");
		numberOfPassengers = sc.nextInt();
		
		System.out.println("Enter the Starting Location : ");
		fromLocation = sc.next();

		System.out.println("Enter the Destination : ");
		toLocation = sc.next();
		
		System.out.println("Enter the Fare per passenger : ");
		normalFare = sc.nextInt();
		
		for(int i=0; i<numberOfPassengers; i++){
			
			System.out.println("Enter Passenger name : ");
			passengerName = sc.next();
			
			System.out.println("Enter Passenger Age : ");
			passengerAge = sc.nextInt();
			
			passengerList[i] = new Passenger(passengerName, passengerAge, normalFare);
			passengerList[i] = fareCalculation(passengerList[i], normalFare);
			
			totalFare+= passengerList[i].getFare();
		}
		
		for(int i=0; i<numberOfPassengers; i++) {
			
			displayDetails = fromLocation +" "+ toLocation +" "+ passengerList[i].toString();
			System.out.println(displayDetails);
		}
			
		System.out.println("Total Fare : "+ totalFare);	
		
	}
	
	public static Passenger fareCalculation(Passenger passenger, int normalFare) {

		if(passenger.getAge()<14) {
			passenger.setFare((int)(normalFare - normalFare*0.45));
		}
		else if(passenger.getAge()>65) {
			passenger.setFare((int)(normalFare - normalFare*0.35));
		}
		else
			passenger.setFare(normalFare);
		return passenger;
	}
}
