package com.cognizant.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.ex01.service.*;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService bookService = (BookService) applicationContext.getBean("bookService");
    	bookService.printBookTitle();    	
    }
}
