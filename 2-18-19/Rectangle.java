/**
Automatically generated Rectangle class from Argo
File 1
@author Jeffrey Wan
@date 2/18/19
*/

public class Rectangle 
{
	//private attributes
  	private double length;
  	private double width;

  	//constructors
  	public Rectangle() 
	{
		this.length = 0;
		this.width = 0;
  	}

 	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
  	}

	//accessors
  	public double getLength() 
	{
		return length;
  	}

  	public double getWidth() 
	{
		return width;
  	}
	
	//setters
  	public void setLength(double length) 
	{
		this.length = length;
  	}

  	public void setWidth(double width) 
	{
		this.width = width;
  	}
	
	//utility methods
	public double calcArea() 
	{
		//local variable
		double area = 0;
		
		//calculations
		area = length * width;
		
		return area;
		//alternatively we can use: return (length * width) because we have access to those attributes
	}
	
	public String toString() 
	{
		//variable
		String str = "";
		
		//append to str
		str += ("Length: " + length + "cm\n");
		str += ("Width: " + width + "cm\n");
		
		return str;
	}

}
