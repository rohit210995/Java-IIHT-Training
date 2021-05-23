/***
 * Create Product class with member data
 * Integer id,
 * String name,
 * Double purchasedPrice,
 * Double salesPrice,
 * String grade
 * Create getter and setter method, 
 * override toString() with String.format("%-5s %-20s %-10s %-10s %-5s",....);
 * Override hashCode() and equals().
 */
package com.javase8.assignment10;

public class Product {
	
	private int id;
	private String name;
	private double purchasedPrice;
	private double salesPrice;
	private String grade;
	
	//Constructor
	public Product() {}
	
	public Product(int id, String name, double purchasedPrice, double salesPrice, String grade) {
		this.id = id;
		this.name = name;
		this.purchasedPrice = purchasedPrice;
		this.salesPrice = salesPrice;
		this.grade = grade;
	}
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPurchasedPrice() {
		return purchasedPrice;
	}
	public void setPurchasedPrice(double purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
	}
	public double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		
		return String.format("%-5s %-20s %-10s %-10s %-5s \n", id, name, purchasedPrice, salesPrice, grade);
	}
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// if both the object references are referring to the same object.
	    if(this == obj)
	            return true;
	    // it checks if the argument is of the 
	    // type Product by comparing the classes 
	    // of the passed argument and this object.
	    // if(!(obj instanceof Geek)) return false; ---> avoid.
	    if(obj == null || obj.getClass()!= this.getClass())
	    
	    	return false;
	          
	    // type casting of the argument. 
	    Product product = (Product) obj;
	          
	    // comparing the state of argument with the state of 'this' Object.
	    
	    return (product.id == this.id);
	}
}
