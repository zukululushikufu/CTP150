/**
Book store and using test plan
File 3
Date: 4/1/19

@author Jeffrey Wan
*/
import java.util.ArrayList;

public class BookStore {

  	public static void main(String[] args) 
  	{
  		//TEST 1---------------------------------------
		//testing no arg constructor
		Book book1 = new Book();
		System.out.println("Book1 using the no args constructor: \n" + book1);
		
		//testing overloaded constructor
		Book book2 = new Book("The Prince of Tides", "Pat Conroy", 20);
		System.out.println("Book2 using the overloaded constructor: \n" + book2);
		
		//TEST 2---------------------------------------
		Book b1 = book1;
		System.out.println("b1: ");
		System.out.println(b1);
		System.out.println("Book1: ");
		System.out.println(book1);
		
		//TEST 3---------------------------------------
		Book copy = new Book(book2);
		System.out.println("Copy of book2: \n" + copy);
		
		//TEST 4---------------------------------------
		if(copy.equals(book2))
			System.out.println("Copy and Book2 are equal");
		else
			System.out.println("Whatever you passed in was not equal to book2");
		
		//TEST 5---------------------------------------
		BookList catalog = new BookList();
		catalog.add(b1);
		catalog.add(copy);
		catalog.add(book1);
		catalog.add(book2);
		
		catalog.display();	//display catalog
		
		//TEST 6---------------------------------------
		catalog.update("the prince of tides", 40.50);
		catalog.update("", 25.75);
		
		catalog.display();
  	}
}