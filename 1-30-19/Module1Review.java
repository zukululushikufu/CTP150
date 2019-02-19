/**
This program does Module1 concepts
File 4
@author: Jeffrey Wan
@date: 1/30/19
*/
import java.text.DecimalFormat;

public class Module1Review
{
	public static void main(String[] args)
	{
		//single line comment
		//public means it can be used outside the class
		//static means it belongs to the class, not to a specific object
		//void is a return type, in this case there's no return
		//main is the method name, [] indicates its an array of String called args
		
		//Let's practice escape sequences
		System.out.println("My \"favourite\" foods are: \n");
		System.out.println("\t Pizza ");
		System.out.println("\t Pineapple \n");
		System.out.println("Burgers" + "\\Fries " + "and a coke!\n");
		
		//although the backslashes are in there it isn't displayed
		// \t is a tab
		// \n is a next line
		// \\ allows us to put in a back slash
		
		//casting
		double outcome = 12 + (6/5);
		System.out.println(outcome + " is the outcome.");
		
		double outcomeCast = 12 + (double)6/5;	//only the 6 is being casted into a double
		System.out.println(outcomeCast + " is the outcome after casting.");
		
		//Order of operation PEMDAS
		//parentheses, exponents. multiplication, division, addition, subtraction
		double pemdas = 4 + 17 % 2 - 1;
		System.out.println(pemdas + " is the answer.");
		
		pemdas = 4 + 17 / 2 - 1;	//answer is incorrect because of integer division
		System.out.println(pemdas + " is the answer after chaning % into /");
		
		//Math class stuff
		outcome = Math.pow(4,2);	// 4^2	Math.pow(number, exponent)
		System.out.println(outcome + " is the outcome.");
		
		double circleArea = Math.PI * Math.pow(3,2);
		System.out.println("Area of a circle with radius 3 is: " + circleArea);
		
		//Using DecimalFormat
		DecimalFormat df = new DecimalFormat("#,##0.000");
		System.out.println(df.format(circleArea) + " is the area of a circle after decimal formatting.");
		
		//Math operators
		outcome = 10;
		outcome += 20;	//outcome should be 30
		outcome /= 5;	//outcome should be 6
		outcome -= 1;	//outcome should be 5
		outcome %= 5; 	//outcome should be 0
		System.out.println(outcome);
		
		//more casting
		int x;
		x = (int)outcome;
		System.out.println(x);
		
		//Strings and constants
		final double TAX_RATE = .04;
		String firstName = "Jeffrey";
		String lastName = new String("Wan");	//inefficient
		
		System.out.println(firstName.toUpperCase());
		System.out.println(lastName.length());		//tells us how many characters are in our variable
		System.out.println(lastName.charAt(0));	//W
		System.out.println(lastName.toUpperCase().charAt(1));	//A
		
		String otherName = "Jeffrey";
		
		if (firstName == otherName)
			System.out.println("They are the same name.");
		else
			System.out.println("They are different names.");
		
		if (firstName.equals(otherName))
			System.out.println("They are equal.");
		else
			System.out.println("They aren't equal.");
			
		String outname = firstName.concat(lastName);	//combines 2 strings
		System.out.println(outname);	
		//Only use == for numbers. Strings, although they look like they have the same name the address is actually different. So they aren't actually really equal
		//We use stringName.equals(otherString) to compare two strings
		
	}//end main
}//end class