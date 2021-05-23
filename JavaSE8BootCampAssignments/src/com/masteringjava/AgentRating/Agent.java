package com.masteringjava.AgentRating;

public class Agent {
	
	private String name;
	private long generatedFund;
	
	//Constructor
	public Agent() {}
	
	//Getters and Setters
	public Agent(String name, long generatedFund) {
		this.name = name;
		this.generatedFund = generatedFund;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getGeneratedFund() {
		return generatedFund;
	}

	public void setGeneratedFund(long generatedFund) {
		this.generatedFund = generatedFund;
	}
	
	public String getRatings() {
		
		String ratings = "*";
		if(generatedFund >= 2000000) {
			ratings = "*****";
		}
		else if(generatedFund >= 1500000) {
			ratings = "***";
		}
		else {
			ratings = "*";
		}
		
		return ratings;
	}
}