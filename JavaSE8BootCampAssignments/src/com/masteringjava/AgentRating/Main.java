package com.masteringjava.AgentRating;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Agent");
		int numberOfAgents = sc.nextInt();
		
		List<Agent> agentsList = new ArrayList<Agent>();
		String agentName;
		long generatedFund;

		List<Integer> ratingsList = new ArrayList<Integer>(numberOfAgents);
		Map<String, String> agentGrading = new HashMap<String, String>();
		
		for(int i=0; i<numberOfAgents; i++) {
			
			System.out.println("Enter the Name of Agent");
			agentName = sc.next();
			System.out.println("Enter the Funds Generated by the Agent : ");
			generatedFund = sc.nextLong();
			
			agentsList.add(new Agent(agentName, generatedFund));			
		}
		//System.out.println(agentsList);
		
		Map<String,String> agentsRatingMap = agentsList.stream()
												.collect(Collectors.toMap(Agent::getName,Agent::getRatings));
		
		System.out.println(agentsRatingMap);
		
		sc.close();
	}
}
//if(generatedFund >= 2000000) {
//	ratingsList.add(5);
//}
//else if(generatedFund >= 1500000) {
//	ratingsList.add(3);
//}
//else {
//	ratingsList.add(1);
//}