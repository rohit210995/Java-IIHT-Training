/**
 * create class name Book which has the following private attributes:
 * Integer bookNumber,
 * String author,
 * one parameterized and non parameterized constructors.
 * Create getter and setter methods, 
 * Override toString() method in the following format
 * String.format("%-10s %-35s %-20s ",....)
 */

package com.masteringjava.PeoplesLibrary;

public class Book {
	
	private int bookNumber;
	private String bookName;
	private String bookAuthor;
	
	//Constructors
	public Book() {}
	
	public Book(int bookNumber, String bookName, String bookAuthor) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	//Getters and Setters
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getAuthor() {
		return bookAuthor;
	}

	public void setAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s %-35s %-20s ",bookNumber, bookName, bookAuthor);
	}
}