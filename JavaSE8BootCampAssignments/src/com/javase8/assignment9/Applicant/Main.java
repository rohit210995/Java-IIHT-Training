package com.javase8.assignment9.Applicant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Applicants : ");
		int numberOfApplicant = sc.nextInt();
		String applicantName;
		int applicantID, applicantMarks1, applicantMarks2, applicantMarks3;
		Applicant[] applicantsList = new Applicant[numberOfApplicant];
				
		for(int i=0; i<numberOfApplicant; i++) {
			
			System.out.println("Enter ID of candidate : ");
			applicantID = sc.nextInt();
			System.out.println("Enter Name of candidate : ");
			applicantName = sc.next();
			System.out.println("Enter Marks1 of candidate : ");
			applicantMarks1 = sc.nextInt();
			System.out.println("Enter Marks2 of candidate : ");
			applicantMarks2 = sc.nextInt();
			System.out.println("Enter Marks3 of candidate : ");
			applicantMarks3 = sc.nextInt();
			
			applicantsList[i] = new Applicant(applicantID, applicantName, applicantMarks1, applicantMarks2, applicantMarks3);
			applicantsList[i].setTotalMarks(totalCalculation(applicantsList[i]));
			applicantsList[i].setTotalPercentage((int)totalPercentage(applicantsList[i]));
	
		}
		
		System.out.println("Details for Each Candidate");
		
		for(int i = 0; i< numberOfApplicant; i++) {
			System.out.println(applicantsList[i].toString());
		}
		
		sc.close();
	}
	
	public static int totalCalculation(Applicant applicant) {

		return (applicant.getMarksSubject1() + applicant.getMarksSubject2() + applicant.getMarksSubject3());	
	}
	
	public static double totalPercentage(Applicant applicant) {
		
		return (((double)(applicant.getTotalMarks())/300.00)*100);
	}

}
//ArrayList<Applicant> applicantsList = new ArrayList<Applicant>();
//
//for(int i=0; i<numberOfApplicant; i++) {
//	
//	System.out.println("Enter ID of candidate : ");
//	applicantID = sc.nextInt();
//	System.out.println("Enter Name of candidate : ");
//	applicantName = sc.nextLine();
//	System.out.println("Enter Marks1 of candidate : ");
//	applicantMarks1 = sc.nextInt();
//	System.out.println("Enter Marks2 of candidate : ");
//	applicantMarks2 = sc.nextInt();
//	System.out.println("Enter Marks3 of candidate : ");
//	applicantMarks3 = sc.nextInt();
//	
//	applicantsList.add(new Applicant(applicantID, applicantName, applicantMarks1, applicantMarks2, applicantMarks3));
//	int totalMarks = totalCalculation(applicantList);
//	
//}