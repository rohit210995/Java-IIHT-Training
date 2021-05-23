package com.javase8.assignment5;

public class PermanentEmployee extends Employee{
	
	private double monthlySalary;
	private double pF;
	private double tax;
	
	// Constructors for PermanentEmployee
	public PermanentEmployee() {
		super();
	}
	
	public PermanentEmployee(String employeeID, String employeeName, String employeeDepartment, double monthlySalary) {
		super(employeeID, employeeName, employeeDepartment);
		this.monthlySalary = monthlySalary;
		this.pF = 0.15*monthlySalary;
		this.tax = (this.monthlySalary + this.pF)*0.30;
	}

	//Getters and Setters
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getpF() {
		return pF;
	}

	public void setpF() {
		this.pF = 0.15*monthlySalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax() {
		this.tax = (monthlySalary + pF)*0.30;
	}
	
	//CalculateTax Method
	@Override
	public void calculateTax() {
		tax = (monthlySalary + pF)*0.30;
		System.out.println("Tax for the Employee : " + getEmployeeID() + " " + getEmployeeName() + " : " + tax);
	}

	//Overriding toString Method
	@Override
	public String toString() {
		return super.toString() + String.format("%-15s %-15s", this.monthlySalary, this.pF);
	} 	
}