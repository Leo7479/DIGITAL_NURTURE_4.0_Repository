package com.cognizant.ex01.service;

import com.cognizant.ex01.repository.*;

public class BookService {
	private BookRepository bookRepo;
	
	public void setBookRepository(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public void printBookTitle() {
		System.out.println("Title: "+bookRepo.getBookTitle());
	}
}
