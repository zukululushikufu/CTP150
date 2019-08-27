/**
Pet Driver
File 3

@author Jeffrey Wan
date: 3/6/19
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PetDriver
{
	public static void main(String[] args) throws IOException
	{
		//instantiations
		File petInfo = new File("pet-1.txt");
		Scanner inputFile = new Scanner(petInfo);
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		//fill Array list
		input(inputFile, pets);

		menu(pets);
	}//end main()
	
	public static void input(Scanner inputFile, ArrayList<Pet> pets)	throws IOException
	{
		//fill arrayList
		while(inputFile.hasNext())
		{
			String name = inputFile.nextLine();
			int weight = inputFile.nextInt();
			//eat newLine character
			inputFile.nextLine();
			
			//add elements into your array list
			pets.add(new Pet(name, weight));
		}	
	}//end input()
	
	public static void display(ArrayList<Pet> pets)
	{	
		//assign info reference variable to the first element in pets ArrayList
		for(Pet info: pets)
		{
			//calling toString
			System.out.println(info);
		}
	}//end display()
	
	public static void sortAlphabetical(ArrayList<Pet> pets)
	{
		//temporary reference variable to hold your pet object
		Pet temp;
		
		
		for(int index = 0; index < (pets.size() - 1); index++)
		{
			for(int j = 1; j < (pets.size()); j++)
			{
				//if previous name is > current name
				if(pets.get(j - 1).getName().compareToIgnoreCase(pets.get(j).getName()) > 0)
				{
					//move previous name to temporary variable. This variable indicates that a name is greater than the previous name
					temp = pets.get(j - 1);
					
					//sets the previous name to the current name
					pets.set((j - 1), pets.get(j));
					
					//sets the current name to the previous name
					pets.set(j, temp);
				}
			}
		}
	}//end sortAlphabetical
	
	public static void sortWeight(ArrayList<Pet> pets)
	{
		//temporary reference variable to hold your pet object
		Pet temp;
		
		for(int index = 0; index < (pets.size() - 1); index++)
		{
			for(int j = 1; j < (pets.size()); j++)
			{
				//if previous name is > current name
				if(pets.get(j - 1).getWeight() > (pets.get(j).getWeight()))
				{
					//move previous name to temporary variable. This variable indicates that a name is greater than the previous name
					temp = pets.get(j - 1);
					
					//sets the previous name to the current name
					pets.set((j - 1), pets.get(j));
					
					//sets the current name to the previous name
					pets.set(j, temp);
				}
			}
		}
	}//end sortWeight
	
	public static void menu(ArrayList<Pet> pets)
	{
		Scanner keyboard = new Scanner(System.in);
		int option = 1;
		
		while (option >= 1 && option <= 2)
		{
			displayMenu();
			System.out.println("Enter an option: ");
			option = keyboard.nextInt();
		
			//menu	
			switch(option)
			{
				case 1: 
					//printing alphebetically sorted name
					sortAlphabetical(pets);
					System.out.print("Names sorted alphabetically: ");
					display(pets);
					break;
				case 2:
					//printing numerically sorted
					sortWeight(pets);
					System.out.print("Pets sorted by weight: ");
					display(pets);
					break;
				default:
					System.out.println("Invalid option. Closing program.");
					System.exit(0);		
			}
		}			
	}//end menu()
	
	public static void displayMenu()
	{
		System.out.println("\nThis program displays the information for all of the pets in the database");
		System.out.println("1.) Display alphabetically	2.) Display in ascending order of weight");
	}
}//end PetDriver