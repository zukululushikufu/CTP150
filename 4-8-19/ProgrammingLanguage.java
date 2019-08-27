/**
ProgrammingLanguage class
File 2

Date: 4/8/19
@author: Jeffrey Wan
*/

public class ProgrammingLanguage
{
	//private attributes
	private String name;
	private int yearReleased;
	private Developer dev;	//aggregation
	
	//constructors
	public ProgrammingLanguage()
	{
		this.name = "";
		this.yearReleased = 0;
		this.dev = new Developer();
	}
	
	//overloaded v1
	public ProgrammingLanguage(String name, int yearReleased, Developer dev)
	{
		this.name = name;
		this.yearReleased = yearReleased;
		this.dev = new Developer(dev);
		//alternatively this.dev = new Developer(dev.getName(), dev.getCompany())
	}
	
	//overloaded v2
	public ProgrammingLanguage(String name, int yearReleased, String devName, String company)
	{
		this.name = name;
		this.yearReleased = yearReleased;
		this.dev = new Developer(devName, company);
	}
	
	//copyConstructor
	public ProgrammingLanguage(ProgrammingLanguage copy)
	{
		this.name = copy.name;
		this.yearReleased = copy.yearReleased;
		this.dev = new Developer(copy.getDev().getName(), copy.getDev().getCompany());
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public int getYearReleased()
	{
		return yearReleased;
	}
	
	public Developer getDev()
	{
		return new Developer(dev);
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setYearReleased(int yearReleased)
	{
		this.yearReleased = yearReleased;
	}
	
	public void setDev(Developer dev)
	{
		this.dev = new Developer(dev);
	}
	
	//equals
	public boolean equals(ProgrammingLanguage test)
	{
		boolean same = false;
		
		if(this.name.equals(test.name) &&
			this.yearReleased == test.yearReleased &&
			this.dev.equals(test.dev))
			same = true;
			
		return same;
	}
	
	//toString
	public String toString()
	{
		String str = "";
		
		str += ("Name: " + name);
		str += ("\nYear Released : " + yearReleased);
		str += ("\nDeveloper: \n" + dev);
		
		return str;
	}
	

}//end class