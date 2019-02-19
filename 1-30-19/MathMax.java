/**
This program demonstrates the Math Class methods of the API
File 1
@author: Jeffrey Wan
@date: 1/30/19
*/

public class MathMax
{
	public static void main(String[] args)
	{
		//variable declarations
		double a = -5;
		double b = -6;
		double c = 25;
		
		System.out.println("What is the maximum number?");
		System.out.println(Math.max(a, b));	//chooses the larger between the two arguments
		System.out.println("What is the square root of " + c + "?");
		System.out.println(Math.sqrt(c));	//gets square root
	}
	
	/* Notes
	*	static means it's not associated with a specific object, it's associated with its class
	*	static classes call other static methods
	*	Parse is used to identify if a string contains literals of a certain data type
	*	Strings are passed by reference
	*/
}//end MathMax
