package com.javase8.assignment5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Employee emp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		String empID = sc.nextLine();
		System.out.println("Enter Employee Name : ");
		String empName = sc.nextLine();
		System.out.println("Enter Employee Department : ");
		String empDept = sc.nextLine();
		
		int eid = Integer.parseInt(empID); 
		
		//Based on EmployeeID the type of Employee will be instantiated
		//For Even ID Employee will be Permanent Employee
		//For Odd ID Employee will be Contract Employee
		if((eid)%2 == 0){			
			
			System.out.println("Enter Employee Monthly Salary : ");
			double empSalary = sc.nextDouble();

			emp = new PermanentEmployee(empID, empName, empDept, empSalary);
		}
		
		else {
			
			System.out.println("Enter Employee Contract Period : ");
			int empContractPeriod = sc.nextInt();
			System.out.println("Enter Employee Contract Salary : ");
			double empContractAmount = sc.nextDouble();
			
			emp = new ContractEmployee(empID, empName, empDept, empContractPeriod, empContractAmount);
			
		}
		
		//Displaying Employee Details
		
		String employeeDetails = emp.toString();
		System.out.println("Employee Details");
		System.out.println(employeeDetails);
		
		
		sc.close();
	}
}