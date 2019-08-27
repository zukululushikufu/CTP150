/**
Stapler class
File 1
Date: 3/25/19

@author Jeffrey Wan
*/
public class Stapler {
	
	//attributes
 	private String brand;
 	private String model;
  	private String color;
  	private double price;
	private int numStaples;

  	//constructors
  	public Stapler() 
	{
		brand = "";
		model = "";
		color = "";
		price = 0;
		numStaples = 0;	
  	}
	
	//overloaded constructor
  	public Stapler(String brand, String model, String color, double price, int numStaples) 
	{
		this.brand = brand;
		this.model  = model;
		this.color = color;
		this.price = price;
		this.numStaples = numStaples;
  	}
	
	//copy constructor
  	public Stapler(Stapler copy) 
	{
		this.brand = copy.brand;
		this.model = copy.model;
		this.color = copy.color;
		this.price = copy.price;
		this.numStaples = copy.numStaples;
  	}
	
	//equals method
  	public boolean equals(Stapler test) 
	{
		boolean same = false;
		
		//test equality for all attributes
		if(this.brand.equalsIgnoreCase(test.brand) && 
			this.model.equalsIgnoreCase(test.model) && 
			this.color.equalsIgnoreCase(test.color) &&
			this.price == test.price &&
			this.numStaples == test.numStaples)
			same = true;
		
		return same;
  	}
	
	//adds staples
  	public void addStaples(int howMany) 
  	{
		numStaples += howMany;  
  	}
	
	//all getters
  	public String getBrand() 
	{
  		return brand;
  	}	

  	public String getModel() 
	{
  		return model;
  	}

  	public String getColor() 
	{
 		return color;
  	}

  	public double getPrice() 
	{
  		return price;
 	}

  	public int getNumStaples() 
	{
  		return numStaples;
  	}
	
	//toString
 	public String toString() 
	{
		String str = "\n";
 		
		//append
		str += ("Brand: " + brand);
		str += ("\nModel: " + model);
		str += ("\nColor: " + color);
		str += ("\nPrice: " + String.format("$%.2f",price));
		str += ("\nCurrent number of staples: " + numStaples);
		
		return str;
  	}

}
