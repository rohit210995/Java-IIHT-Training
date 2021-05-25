package com.javase8.assignment8;

//import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Date in the format (yyyy-mm-dd) : ");
		String inputDate = sc.nextLine();
		
		LocalDate date = LocalDate.parse(inputDate);
		
		if(calculateAge(date)) {
			System.out.println("Eligible to VOTE !!!!!!");
		}
		else {
			System.out.println("Not Eligible to Vote XXXX");
		}
		sc.close();
	}
	
	public static boolean calculateAge(LocalDate date) {
		
		LocalDate currentDate = LocalDate.now();
		
		Period period = Period.between(date, currentDate);
		
		int ageYears = period.getYears();
		
		System.out.println("Your Age is : " + ageYears);
		
		if(ageYears <18)
			return false;
		
		return true;
	}

}


//public class Main {
//
//	public static void main(String[] args) throws ParseException {
//		
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("Enter Date in the format (dd-mm-yyyy) : ");
//		String inputDate = sc.nextLine();
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = formatter.parse(inputDate);
//		
//		LocalDate localDate = LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(date) );
//		
//		System.out.println(localDate);
//		
//		if(calculateAge(localDate)) {
//			System.out.println("Eligible to VOTE !!!!");
//		}
//		
//		else {
//			System.out.println("CANNOT to VOTE !!!!");
//		}
//		sc.close();
//	}
//	
//	public static boolean calculateAge(LocalDate date) {
//		
//		LocalDate currentDate = LocalDate.now();
//		
//		Period period = Period.between(date, currentDate);
//		
//		int ageYears = period.getYears();
//		
//		System.out.println("Your Age is : " + ageYears);
//		
//		if(ageYears <18)
//			return false;
//		
//		return true;
//	}
//
//}
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
//String date = "16/08/2016";
//
////convert String to LocalDate
//LocalDate localDate = LocalDate.parse(date, formatter);