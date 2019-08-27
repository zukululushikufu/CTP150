/**
BookList class
File 2
Date: 4/1/19

@author Jeffrey Wan
*/
import java.util.ArrayList;

public class BookList {
	
	//private attributes
  	private ArrayList<Book> catalog;
  	private static int numBooks;
  
  	//no-arg constructor
  	public BookList() 
	{
		catalog = new ArrayList<Book>();
  	}
	
	//adds a copy of a book into the array list called catalog
  	public void add(Book book) 
	{
		Book copy = new Book(book);
		catalog.add(copy);
		numBooks++;	//adds a book so increment
  	}
	
	//send over a title and updated price
  	public void update(String title, double price) 
  	{
		for (Book book: catalog)
		{
			if(title.equalsIgnoreCase(book.getTitle()))
				book.setPrice(price);
		}
	}
	
	//displays all books in the array list
  	public void display() 
	{
		System.out.println("_________________________");
		System.out.printf("There are %d books in your catalog\n", numBooks);
		System.out.println(this.toString());
  	}

  	public String toString() 
	{
		String str = "";
		
		for(Book book: catalog)
		{
			str += (book.toString() + "\n");
		}
		
  		return str;
  	}

}