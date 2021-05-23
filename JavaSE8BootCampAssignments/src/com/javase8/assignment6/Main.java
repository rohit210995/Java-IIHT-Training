package com.javase8.assignment6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Shape s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Comma Separated String like - 15,10 : ");
		String inputString = sc.nextLine();
		
		String[] values = inputString.split(",");
		
		int firstValue = Integer.parseInt(values[0]);
		int secondValue = Integer.parseInt(values[0]);
	
		if(secondValue == 0){
			s = new Circle(firstValue);
			System.out.println("The Perimeter Circle : " + s.perimeterCalculation());
			System.out.println("The Area of Circle : " + s.areaCalculation());
		}
		
		else {
			s = new Ellipse(firstValue, secondValue);
			System.out.println("The Perimeter Ellipse : " + s.perimeterCalculation());
			System.out.println("The Area of Ellipse : " + s.areaCalculation());
		}
	}
}
