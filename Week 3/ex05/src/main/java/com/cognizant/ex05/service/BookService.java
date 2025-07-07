package com.cognizant.ex05.service;

import com.cognizant.ex05.repository.*;

public class BookService {
	 private BookRepository bookRepository;
	    public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    public String getBookDetails() {
	        return bookRepository.getBook();
	    }
}
