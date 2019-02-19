/**
This program copies an argument
File 2
@author: Jeffrey Wan
@date: 1/30/19
*/

public class PassByValue
{
	public static void main(String[] args)
	{
		int number = 99;
		System.out.println("number before changeMe: " + number);
		changeMe(number);
		System.out.println("number after changeMe: " + number);
	
	}//end main
	
	public static void changeMe(int myValue)
	{
		System.out.println("I am changing the value.");
		myValue = 0;
		System.out.println("Now the value is: " + myValue);
		
	}//end changeMe
}//end PassByValue