/**
 * Create Main class with method public static void main(String [] arg)-> 
	 * It will accept the number of items to accept then each item as a String with comma separate format 
	 * eg: 1001,Salt,20.00,22.00,E
	 * 1002,Biriyani Masala,45.00,55.00,N
 * Finally display all listed items only. Do not show which are rejected in the list.
*/

package com.javase8.assignment10;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Items : ");
		int numberOfItems = sc.nextInt();

		Set<Product> productSet = new HashSet<Product>();

		for(int i=0; i<numberOfItems;i++) {
			
			try{	
				System.out.println("Enter the item in comma separated format like (1001,Salt,20.00,22.00,E) : ");
				String inputString = sc.next();
				String[] itemsString = inputString.split(",");
				int id = Integer.parseInt(itemsString[0]);
				String itemName = itemsString[1];
				double purchasePrice = Double.parseDouble(itemsString[2]);
				double sellingPrice = Double.parseDouble(itemsString[3]);
				String grade = itemsString[4];
				// Raising PriceException : Sales price must be higher than purchase price otherwise an exception will be thrown
				if(sellingPrice < purchasePrice) {
					throw new PriceException("Selling Price cannot be less than Purchase Price !!");
				}
				
				// Raising EssentialCommodityException : E graded items sales price cannot be more than 
				// 25% of purchase price otherwise it will throw an exception.
				if((grade == "E") && (sellingPrice > purchasePrice + purchasePrice * 0.25)) {
					throw new EssentialCommodityException("Selling Price cannot be less than Purchase Price !!");
				}
				
				// Raising GradeMismatch : is grade is not E/N throw an Exception
				if((grade != "E")||(grade != "N")) {
					throw new GradeMismatchException("Grade can only be Essential(E) or Non-Essential(N)");
				}
				
				productSet.add(new Product(id, itemName, purchasePrice, sellingPrice, grade));
			}
			catch(PriceException p){
				System.out.println(p);
			}
			catch(EssentialCommodityException e) {
				System.out.println(e);
			}
			catch(GradeMismatchException g) {
				System.out.println(g);
			}
		}
		
		System.out.println(productSet.toString());
		
	sc.close();	
	}	
}


//Working Code Skeleton
//Scanner sc = new Scanner(System.in);
//
//System.out.println("Enter Number of Items : ");
//int numberOfItems = sc.nextInt();
//Product[] productList = new Product[numberOfItems];
//
//for(int i=0; i<numberOfItems;i++) {
//	
//	try{	
//		System.out.println("Enter the item in comma separated format like (1001,Salt,20.00,22.00,E) : ");
//		String inputString = sc.next();
//		String[] itemsString = inputString.split(",");
//		int id = Integer.parseInt(itemsString[0]);
//		String itemName = itemsString[1];
//		double purchasePrice = Double.parseDouble(itemsString[2]);
//		double sellingPrice = Double.parseDouble(itemsString[3]);
//		String grade = itemsString[4];
//		// Raising PriceException : Sales price must be higher than purchase price otherwise an exception will be thrown
//		if(sellingPrice < purchasePrice) {
//			throw new PriceException("Selling Price cannot be less than Purchase Price !!");
//		}
//
//		// Raising GradeMismatch : is grade is not E/N throw an Exception
//		if((grade != "E")||(grade!="N")) {
//			throw new GradeMismatchException("Grade can only be Essential(E) or Non-Essential(N)");
//		}
//		
//		// Raising EssentialCommodityException : E graded items sales price cannot be more than 
//		// 25% of purchase price otherwise it will throw an exception.
//		if((grade == "E") && (sellingPrice > purchasePrice + purchasePrice * 0.25)) {
//			throw new EssentialCommodityException("Selling Price cannot be less than Purchase Price !!");
//		}
//		
//		productList[i] = new Product(id, itemName, purchasePrice, sellingPrice, grade);
//	}
//	catch(PriceException p){
//		System.out.println(p);
//	}
//	catch(EssentialCommodityException e) {
//		System.out.println(e);
//	}
//	catch(GradeMismatchException g) {
//		System.out.println(g);
//	}
//}
//
//for(int i=0; i<numberOfItems;i++) {
//	System.out.println(productList[i].toString());
//}
//sc.close();		
