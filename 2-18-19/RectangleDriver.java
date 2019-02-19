/**
Automatically generated application class for Rectangle from Argo
File 2
@author Jeffrey Wan
@date 2/18/19
*/

public class RectangleDriver 
{
  public static void main(String[] args) 
  {
  		//instantiate object
		Rectangle square = new Rectangle();
		System.out.println(square);
		
		//overload constructor
		Rectangle box = new Rectangle(5, 15);	//Rectangle(double length, double width)
		System.out.println(box);
		
		//changing attribute values for our objects
		box.setLength(10);
		System.out.println("Changed length to: 10");
		System.out.println(box);
		
		//displaying area
		System.out.println("Box's area is: " + box.calcArea());
  }

}