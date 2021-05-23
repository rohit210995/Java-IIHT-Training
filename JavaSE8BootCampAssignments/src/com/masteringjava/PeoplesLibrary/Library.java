/**
 * create class Library which has the following members:
 * a) private static List<Book> bookList;
 * b) static block to store at least 6 books object into the list.
 * c) public static List<Book> getAllBooks() : to return the bookList;
*/
package com.masteringjava.PeoplesLibrary;

import java.util.*;

public class Library {
	
	private static List<Book> bookList;
	
	static {
		bookList = new ArrayList<Book>();
		bookList.add(new Book(1, "Harry Potter and the Deathly Hallows", "J K Rowling"));
		bookList.add(new Book(2, "A Knight of the Seven Kingdoms", "R R Martin"));
		bookList.add(new Book(3, "A Study in Scarlet", "Conan Doyle"));
		bookList.add(new Book(4, "The Alchemist", "Paulo Coelho"));
		bookList.add(new Book(5, "The Power of GRIT", "Angela Duckworth"));
		bookList.add(new Book(6, "Delhi is not Far", "Ruskin Bond"));
		bookList.add(new Book(7, "You can WIN", "Shiv Khera"));
	}
	
	public static List<Book> getAllBooks(){
		
		return bookList;
	}
}