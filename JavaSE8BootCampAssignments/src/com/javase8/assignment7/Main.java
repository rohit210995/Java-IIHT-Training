package com.javase8.assignment7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int op1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int op2 = sc.nextInt();
		System.out.println("Enter the operation you want to perform (+,-,*,/,%): ");
		String op = sc.next();
		
		CalculatorFace calc;
		
		int results = performCalculation(op1, op2, op);
		System.out.println("Evaluated Expression : " + results);
	}
	
	public static int performCalculation(int op1, int op2, String op) {
		int result = 0;
		switch(op) {
		case "+": CalculatorFace calcAdd = (operator1, operator2, operator) -> { return operator1 + operator2; };
				  result = calcAdd.calculate(op1, op2, op);
				  break;
		case "-": CalculatorFace calcSub = (operator1, operator2, operator) -> { return operator1 - operator2; };
		  		  result = calcSub.calculate(op1, op2, op);
				  break;
		case "*": CalculatorFace calcMult = (operator1, operator2, operator) -> { return operator1 * operator2; };
		  		  result = calcMult.calculate(op1, op2, op);
				  break;
		case "/": CalculatorFace calcDiv = (operator1, operator2, operator) -> { return operator1 / operator2; };
		  		  result = calcDiv.calculate(op1, op2, op);
				  break;
		case "%": CalculatorFace calcMod = (operator1, operator2, operator) -> { return operator1 % operator2; };
		  	 	  result = calcMod.calculate(op1, op2, op);
				  break;
		}
		return result;
	}

}
// Lambda Definition
//CalculatorFace calc = (num1, num2) -> { return num1 + num2; };
//System.out.println(calc.calculate(4, 5));
