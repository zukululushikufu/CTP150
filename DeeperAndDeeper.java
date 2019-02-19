/**
	This program defines and calls a simple method
	File 3
	@author: Jeffrey Wan
	@date: 1/28/19
*/

public class DeeperAndDeeper
{
	public static void main(String[] args)
	{
		System.out.println("Hello from main method");
		deep();
		
		System.out.println("Back in main method");
	}//end main()
	
	public static void deep()
	{
		System.out.println("Hello from deep");
		deeper();
		System.out.println("Back in deep");
	}//end deep()
	
	public static void deeper()
	{
		System.out.println("I am now in the deeper method");
	}//end deeper()
	

}//end LoopCall

/* Notes
* Static methods call other static methods
* Single statements in for loops don't require {}
* 
*/