/**
Stapler Driver
File 2
Date: 3/25/19

@author: Jeffrey Wan
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StapleDriver {

  	public static void main(String[] args) throws IOException 
	{
		//objects and variables
		Stapler[] staplers = new Stapler[2];
		readAllStaplers(staplers);
		displayAllStaplers(staplers);
		displayStaplerByColors(staplers);
		addStaples(staplers);
		
  	}//end main()

  	public static void addStaples(Stapler stapler[]) 
	{
		//variables and objects
		Scanner keyboard = new Scanner(System.in);
		int i = 0;
		int num = 0;
		
		//display indices of staplers
		for(int index = 0; index < stapler.length; index++)
		{
			System.out.print(index + "\t");
			System.out.println(	stapler[index].getBrand() + "\t" +
										stapler[index].getModel() + "\t" +
										stapler[index].getNumStaples());
		}
		
		//start adding staples
		System.out.println("\nWhich index to add staples to?");
		i = keyboard.nextInt();
		
		System.out.println("How many staples do you want to add?");
		num = keyboard.nextInt();
		
		stapler[i].addStaples(num);
		System.out.println(stapler[i]);
		
  	}//end addStaples

  	public static void displayStaplerByColors(Stapler stapler[]) 
  	{
  		//variable
		String input = "";
		Scanner keyboard = new Scanner(System.in);
		boolean found = false;
		
		//prompt
		System.out.println("What color are you looking for: ");
		input = keyboard.nextLine();
		
		//search
		for (Stapler staplers: stapler)
		{
			if(staplers.getColor().equalsIgnoreCase(input))
			{
				System.out.println(staplers);
				System.out.println("----------------------------");
				found = true;
			}
		}	
		
		//display error message
		if (!found)
		{
			System.out.println("We do not have a stapler in that color.");
		}		
  	}//end displayStaplerByColors

  	public static void displayAllStaplers(Stapler stapler[]) 
	{
		//normal for loop
		for(int index = 0; index < stapler.length; index++)
		{
			System.out.println(stapler[index]);
			System.out.println("----------------------------");
		}
		
		/*	enhanced for loop
		*	for(Stapler display : stapler)
		 	{
				System.out.println(display);
			}
		*/
  	}//end displayAllStaplers

  	public static void readAllStaplers(Stapler stapler[]) throws IOException
	{
		//objects
		File staplersInfo = new File("staplefile");
		Scanner inputFile = new Scanner(staplersInfo);
		int i = 0;
		
		//check file existence
		if (!staplersInfo.exists())
		{
			System.out.println("File does not exist. Closing program");
			System.exit(0);
		}
		
		while(inputFile.hasNextLine())
		{
			String brand = inputFile.nextLine();
			String model = inputFile.nextLine();
			String color = inputFile.nextLine();
			double price = Double.parseDouble(inputFile.nextLine());
			int numStaples = Integer.parseInt(inputFile.nextLine());
			
			stapler[i++] = new Stapler(brand, model, color, price, numStaples);
		}
		
		//close file
		inputFile.close();
		
  	}//end readAllStaplers

}