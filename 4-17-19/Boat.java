/**
This is the parent Boat class

Date: 4/17/19
@author Jeffrey Wan
*/
import java.util.Date;
import java.util.Calendar;

public class Boat
{
	//private attributes
	private static int nextID = 101;	//incremented after every instantiation
	
	private int id;
	private int length;
	private String owner;
	private Date launchDate;
	
	//constructors
	public Boat()
	{
		this("", 0);
	}
	
	public Boat(String owner)
	{
		this(owner, 0);	//this calls the overloaded constructor
	}
	
	public Boat(String owner, int length)
	{
		id = nextID++;
		this.length = length;
		this.owner = owner;
		this.launchDate = Calendar.getInstance().getTime();
	}
	
	public Boat(Boat copy)
	{
		this.id = copy.id;
		this.length = copy.length;
		this.owner = copy.owner;
		this.launchDate = copy.launchDate;
	}
	
	//getters and setters for owner
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	//equals method
	public boolean equals(Boat test)
	{
		return (	this.id == test.id &&
					this.length == test.length &&
					this.owner.equals(test.owner) &&
					this.launchDate.equals(test.launchDate)) ? true : false;
	}
	
	public String toString()
	{
		return (	"\nID: " + id +
					"\nLength: " + length +
					"\nOwner: " + owner +
					"\nLaunch Date: " + launchDate); 
	}

}
