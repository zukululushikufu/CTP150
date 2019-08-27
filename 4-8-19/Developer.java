/**
Developer class
File 1

Date: 4/8/19
@author: Jeffrey Wan
*/

public class Developer
{
	//private attributes
	private String name;
	private String company;
	private static int instanceCount = 0;	//only one copy of this field in memory regardless of number of objects
	
	//constructors
	public Developer()
	{
		this.name = "";
		this.company = "";
		
		instanceCount++;
	}
	
	//overloaded constructor
	public Developer(String name, String company)
	{
		this.name = name;
		this.company = company;
		
		instanceCount++;
	}
	
	//copy constructor
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
	
	public String getCompany()
	{
		return company;
	}
	
	public int getInstanceCount()
	{
		return instanceCount;
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
	
	
	//copy method
	public Developer copy()
	{
		Developer copyObject = new Developer(name, company);
		
		return copyObject;
	}
	
	//equals
	public boolean equals(Developer test)
	{
		//if this.name and this.company == test.name and test.company return true else false
		return this.name.equalsIgnoreCase(test.name) && this.company.equalsIgnoreCase(test.company) ? true : false;
	}
	
	//toString
	public String toString()
	{
		String str = "";
		
		str += ("Name: " + name);
		str += ("\nCompany: " + company + "\n");
		
		return str;
	}

}//end class
