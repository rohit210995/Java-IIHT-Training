/**
 * create class Passenger with following private attributes:
 * String name,
 * Integer age,
 * Integer fare
 * Create getter/setter methods 
 * constructors. 
 * Override toString() with String.format("%-10s %-5s %-5s ",....);
 */
package com.javase8.assignment9.RailwayTicketApplicant;

public class Passenger {
	
	private String passengerName;
	private int passengerAge;
	private int passengerFare;
	
	//Constructors for Passenger
	public Passenger() {}

	public Passenger(String passengerName, int passengerAge, int passengerFare) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerFare = passengerFare;
	}

	//Getters and Setters for Attributes
	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAge() {
		return passengerAge;
	}

	public void setAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public int getFare() {
		return passengerFare;
	}

	public void setFare(int passengerFare) {
		this.passengerFare = passengerFare;
	}

	@Override
	public String toString() {
		
		return String.format("%-10s %-5s %-5s ", passengerName, passengerAge, passengerFare);
	}	
}