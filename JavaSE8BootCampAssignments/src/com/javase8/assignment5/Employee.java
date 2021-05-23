package com.javase8.assignment5;

public class Employee {

	//Private Data Members
	private String employeeID;
	private String employeeName;
	private String employeeDepartment;
	
	//Constructor for Employee
	public Employee() {}
	
	public Employee(String employeeID, String employeeName, String employeeDepartment) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}	
	
	//Getters and Setters
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	//CalculateTax method without any body
	public void calculateTax() {}

	public String toString() { 
		return String.format("%-10s %-20s %-15s", this.employeeID, this.employeeName, this.employeeDepartment);
	} 
}