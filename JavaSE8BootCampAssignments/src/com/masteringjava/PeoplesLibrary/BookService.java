/***
 * Create class BookService with the followings methods
 * a) public List<Book> arrangeBooksNumberWise(List<Book> bookList) to arrange books in ascending order of book number.
 * b) public List<Book> arrangeBooksTitleWise(List<Book> bookList) to arrange books in ascending order of book title.
 * c) public List<Book> arrangeBooksAuthorWise(List<Book> bookList) to arrange books in ascending order of author’s name.
 */
package com.masteringjava.PeoplesLibrary;

import java.util.*;

public class BookService{
	
	public List<Book> arrangeBooksNumberWise(List<Book> bookList){
		
		Collections.sort(bookList, (bookOne, bookTwo) -> {return Integer.valueOf(bookOne.getBookNumber()).compareTo(Integer.valueOf(bookTwo.getBookNumber()));});
		return bookList;
	}
	
	public List<Book> arrangeBooksTitleWise(List<Book> bookList){
		
		Collections.sort(bookList, (bookOne, bookTwo) -> {return bookOne.getBookName().compareTo(bookTwo.getBookName());});
		return bookList;
	}
	
	public List<Book> arrangeBooksAuthorWise(List<Book> bookList){
	
		Collections.sort(bookList, (bookOne, bookTwo) -> {return bookOne.getAuthor().compareTo(bookTwo.getAuthor());});
	return bookList;
	}
}