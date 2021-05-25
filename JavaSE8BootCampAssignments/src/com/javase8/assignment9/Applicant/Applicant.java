package com.javase8.assignment9.Applicant;

public class Applicant {
	
	private int registrationNumber;
	private String applicantName;
	private int marksSubject1;
	private int marksSubject2;
	private int marksSubject3;
	private int totalMarks;
	private int totalPercentage;
	
	public Applicant(){}
	
	public Applicant(int registrationNumber, String applicantName, int marksSubject1, int marksSubject2, int marksSubject3){
		
		this.registrationNumber = registrationNumber;
		this.applicantName = applicantName;
		this.marksSubject1 = marksSubject1;
		this.marksSubject2 = marksSubject2;
		this.marksSubject3 = marksSubject3;
	}
	
	//Getter Setter for Applicant
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public int getMarksSubject1() {
		return marksSubject1;
	}
	public void setMarksSubject1(int marksSubject1) {
		this.marksSubject1 = marksSubject1;
	}
	public int getMarksSubject2() {
		return marksSubject2;
	}
	public void setMarksSubject2(int marksSubject2) {
		this.marksSubject2 = marksSubject2;
	}
	public int getMarksSubject3() {
		return marksSubject3;
	}
	public void setMarksSubject3(int marksSubject3) {
		this.marksSubject3 = marksSubject3;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getTotalPercentage() {
		return totalPercentage;
	}
	public void setTotalPercentage(int totalPercentage) {
		this.totalPercentage = totalPercentage;
	}

	@Override
	public String toString() {
		
		return String.format("%-5s %-10s %-5s %-5s %-5s %-10s %-10s", registrationNumber, applicantName, marksSubject1, marksSubject2, marksSubject3, totalMarks, totalPercentage);
	}

}
