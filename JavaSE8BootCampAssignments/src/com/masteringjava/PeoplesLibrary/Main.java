/**
 * Create class Main with the method public static void main(String [] args). It will display a menu in the following format:
 * Menu
 * 1.Display Book Number-wise
 * 2.Display Book Title-wise
 * 3.Display Book Author-wise
 * 4.Exit
 * Enter choice(1-4):
 * finally displays the books based on sorting choice in the mentioned formatted manner with headings .
 */
package com.masteringjava.PeoplesLibrary;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Get all the list of Books
		List<Book> booksList = Library.getAllBooks();
		BookService bookService = new BookService();
		
		System.out.println("Menu");
		System.out.println("1. Display Book Number-wise");
		System.out.println("2. Display Book Title-wise");
		System.out.println("3. Display Book Author-wise");
		System.out.println("4. Exit");
		
		int ch;
		do {
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: booksList = bookService.arrangeBooksNumberWise(booksList);
					displayBooksList(booksList);
					break;
					
			case 2: booksList = bookService.arrangeBooksTitleWise(booksList);
					displayBooksList(booksList);
					break;
					
			case 3: booksList = bookService.arrangeBooksAuthorWise(booksList);
					displayBooksList(booksList);
					break;
					
			case 4: return;
			
			default : System.out.println("InValid Option !!!");
			}
		}while(ch!=4);

	}
	
	public static void displayBooksList(List<Book> booksList) {
		//Displaying The Books
		String bookNumber = "Book Number";
		String bookName = "Book Name";
		String bookAuthor = "Book Author";
		System.out.println(String.format("%-10s %-35s %-20s ",bookNumber, bookName, bookAuthor));
		
		for(int i=0; i<booksList.size();i++) {
			
			System.out.println(booksList.get(i).toString());
		}
	}
}