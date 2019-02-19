/**
	This program defines and calls a simple method
	File 2
	@author: Jeffrey Wan
	@date: 1/28/19
*/

public class LoopCall
{
	public static void main(String[] args)
	{
		System.out.println("Hello from main method");
		for(int i = 0; i < 5; i++)
			displayMessage();
		
		System.out.println("Back in main method");
	}//end main()
	
	public static void displayMessage()
	{
		System.out.println("Hello from displayMessage");
	}//end displayMessage()

}//end LoopCall

/* Notes
* Static methods call other static methods
* Single statements in for loops don't require {}
* 
*/