/**
Circle class blueprint
File 1
@author Jeffrey Wan
date: 2/25/19
*/

public class Circle 
{
	//private attributes
  	private double radius;

  	/**
	Circle no-arg constructor
	@param
	*/
  	public Circle() 
	{
		radius = 0;
  	}
	
	/**
	Circle overloaded constructor
	@param r The radius of the circle
	*/
  	public Circle(double r) 
  	{
		this.radius = r;
  	}
	
	/**
	Get radius of the circle
	@return radius is the radius of the circle
	*/
  	public double getRadius() 
	{
  		return radius;
  	}
	
	/**
	setRadius() changes the value of the radius for the circle
	@param newRadius The new radius of the circle
	*/
  	public void setRadius(double newRadius) 
	{
		this.radius = newRadius;
  	}
	
	/**
	The equals method returns true if the circles are equal
	@param someCircle is any circle
	@return true if the circles are equal
	*/
  	public boolean equals(Circle someCircle) 
	{
		//local variables
		boolean equal = false;
		
		//comparing 
		if (radius == someCircle.radius)
			equal = true;
		
  		return equal;
  	}

  	public String toString() 
  	{
		String str = "";
		
		str += ("The circle has a radius of " + radius + "cm");
		
  		return str;
  	}

}
