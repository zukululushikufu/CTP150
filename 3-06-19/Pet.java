/**
Pet Class
File 2

@author Jeffrey Wan
date: 3/6/19
*/

public class Pet
{
	//private attributes
	private String name;
	private int weight;
	
	//constructors
	public Pet()
	{
		name = "";
		weight = 0;
	}
	
	public Pet(String name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	//toSTring
	public String toString()
	{
		//declaration
		String str = "";
		
		//append
		str += ("\nName: " + name);
		str += ("\nWeight: " + weight);
		
		//return
		return str;
	}
}
