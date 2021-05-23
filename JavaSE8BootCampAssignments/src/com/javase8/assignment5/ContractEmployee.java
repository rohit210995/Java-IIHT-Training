package com.javase8.assignment5;

public class ContractEmployee extends Employee {
	
	//Private Data Members
	private int contractPeriod;
	private double contractAmount;
	private double tax;
	
	//Constructor
	public ContractEmployee(){
		super();
	}

	public ContractEmployee(String employeeID, String employeeName, String employeeDepartment, int contractPeriod,
			double contractAmount) {
		super(employeeID, employeeName, employeeDepartment);
		this.contractPeriod = contractPeriod;
		this.contractAmount = contractAmount;
		this.tax = contractAmount*0.30;
	}
	
	//Getter and Setter
	public int getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public double getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(double contractAmount) {
		this.contractAmount = contractAmount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax() {
		this.tax = contractAmount*0.30;
	}

	//Override CalculateTax Method
	@Override
	public void calculateTax() {
		tax = contractAmount*0.30;
		System.out.println("Tax for the Employee : " + getEmployeeID() + " " + getEmployeeName() + " : " + tax);
	
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-15s %-15s", this.contractPeriod, this.contractAmount);
	}	
}