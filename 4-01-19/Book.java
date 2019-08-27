/**
Book Class
File 1
Date: 4/1/19

@author Jeffrey Wan
*/

public class Book {
	
	//private attributes
  	private String title;
  	private String author;
  	private double price;

	//no-arg constructor    
  	public Book() 
	{
		//this(" "," ", 0) also works. This intializes based on the order you declare your attributes
		title = "";
		author = "";
		price = 0;
  	}
	
	//overloaded constructor
  	public Book(String title, String author, double price) 
	{
		this.title = title;
		this.author = author;
		this.price = price;
  	}
	
	//copy constructor
  	public Book(Book copy) 
	{
		this.title = copy.title;
		this.author = copy.author;
		this.price = copy.price;
  	}
	
	//getters
  	public String getTitle() 
	{
  		return title;
  	}

  	public String getAuthor() 
	{
  		return author;
  	}

  	public double getPrice() 
	{
  		return price;
  	}
	
	//setters
  	public void setTitle(String title) 
	{
		this.title = title;
  	}

  	public void setAuthor(String author) 
	{
		this.author = author;
  	}

 	public void setPrice(double price) 
	{
		this.price = price;
  	}
	
	//compares equality of two objects
  	public boolean equals(Book test) 
	{
		if(this.title.equals(test.title) && 
			this.author.equals(test.author) && 
			this.price == test.price)
			return true;
		else
  			return false;
  	}
	
	//replace hexadecimal memory address with String reperesentation of object state
  	public String toString() 
	{
		String str = "";
		
		str += ("Title: " + title);
		str += ("\nAuthor: " + author);
		str += ("\nPrice : $" + String.format("%.2f\n", price));
  		
		return str;
  	}

}
