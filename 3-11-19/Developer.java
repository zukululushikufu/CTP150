/**
Language Driver
File 1

@author Jeffrey Wan
Date: 3/11/19
*/

/*	Notes
*	Notice no static method in this class
*/

public class Developer {
	
	//private attributes
  	private String name;
  	private String company;
	
	//private static attributes
 	private static int instanceCount;	//only copy of this field is available in this Developer class

	//constructors 
  	public Developer() 
	{
		name = " ";
		company = " ";
		instanceCount++;	//every time this class is instantiated it will increment instanceCount
  	}
	
	//overloaded constructor
  	public Developer(String name, String company) 
  	{
		this.name = name;	//this keyword refers to the attribute and not the parameter
		this.company = company;
		instanceCount++;
  	}

	//copy constructor
	//used because we can't do object1 = object2
  	public Developer(Developer copy) 
	{
		this.name = copy.name;
		this.company = copy.company;
		instanceCount++;	
  	}
	
	//getters
  	public String getName() 
	{
  		return name;
  	}

  	public int getInstanceCount() 
	{
  		return instanceCount;
  	}

  	public String getCompany() 
	{
  		return company;
  	}
	
	//setters
  	public void setName(String name) 
	{
		this.name = name;
  	}

  	public void setCompany(String company) 
	{
		this.company = company;
  	}

	//equals method is used to compare the attributes of two objects
	public boolean equals(Developer test) 
	{
		boolean same = false;
		
		//compare
		if(this.name.equalsIgnoreCase(test.name) &&
			this.company.equalsIgnoreCase(test.company))
		{	
			same = true;
		}
		
  		return same;
  	}

	//toString
  	public String toString() 
	{
		String str = "\n";
		
		//append
		str += ("Name: " + this.name);
		str += ("\nCompany: " + this.company);
		
  		return str;
  	}
}//end Developer
