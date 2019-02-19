/**
	This program demonstrates a few String methods
	File 1
	@author: Jeffrey Wan
	@date: 1/28/19
*/

public class StringMethod
{
	public static void main(String[] args)
	{
		//variable declaration
		String message = "Java is Great Fun!";
		String upper = message.toUpperCase();
		String lower = message.toLowerCase();
		char letter = message.charAt(2);
		int stringSize = message.length();
		
		//testing out our variables
		System.out.println(message);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(letter);
		System.out.println(stringSize);	//18. Maxmimum charAt(int index) is 18. Anything past 18 is out of bounds.
	}//end main
}//end StringMethod

	/*Notes
	* charAt() is a method from the String class. First character starts at index 0. Meaning J == charAt(0)
	* java.lang is automatically in every java class. It does need to be imported
	* java.lang.String is inherited from java.lang.Object
	* https://docs.oracle.com/javase/8/docs/api/index.html?java/lang/String.html <- URL for the String API
	* Some other common classes other than String includes Math and System.
	* JOptionPOane for dialog boxes. Import using javax.swing
	*/
