/**
Create an array with hard coded data and then a random generator
File 3
@author Jeffrey Wan
date : 2/25/19
*/

import java.util.Random;
import javax.swing.JOptionPane;
public class Play2
{
	public static void main(String[] args)
	{
		//create an array of integers
		int[] numbers;
		numbers = new int[4];	//creating an array of 4 elements
		int n = 0;
		
		//assigning random variables to our array
		Random rand = new Random();
		for (int index = 0; index < numbers.length; index++)
		{
			numbers[index] = rand.nextInt(100);
			System.out.println(numbers[index]);
		}
		
		
		//creates buttons using the dialogs
		Object[] options = {"Display my array", "Display with Random/Loop", "Display with enhanced loop","Get highest value", "Get lowest value", "Exit"};
		
		do
		{
			n = JOptionPane.showOptionDialog(null, "Which option do you want?", "Array Options Menu",
				 JOptionPane.DEFAULT_OPTION,
				 JOptionPane.PLAIN_MESSAGE,
				 null,
				 options,
				 options[0]);
				 
			switch (n)
			{
				case 0: fillArray(numbers);
				break;
				case 1: displayArrayForLoop(numbers);
				break;
				case 2: displayEnhancedForLoop(numbers);
				break;
				case 3: getHighest(numbers);
				break;
				case 4: getLowest(numbers);
				break;
			}//end switch
		}while( n!= 5);
	}//end main()
	
	public static void fillArray(int[] numbers)
	{
		for (int index = 0; index < numbers.length; index++)
			System.out.println(numbers[index]);
		
		System.out.println();
	}//end fillArray()
	
	public static void displayArrayForLoop(int[] numbers)
	{
		Random rand = new Random();
		
		for (int index = 0; index < numbers.length; index++)
		{
			numbers[index] = rand.nextInt(100);
			
			System.out.println(numbers[index]);
		}
		
		System.out.println();
	}//end displayArrayForLoop()
	
	public static void displayEnhancedForLoop(int[] numbers)
	{
		for (int var : numbers)
			System.out.println(var);
			
		System.out.println();
	}//end displayEnhancedForLoop()
	
	public static void getHighest(int[] numbers)
	{
		int highest = numbers[0];
		
		for(int index = 1; index < numbers.length; index++)
		{
			if (numbers[index] > highest)
				highest = numbers[index];
		}
		
		System.out.println("Highest value is " + highest);
		System.out.println();
	
	}//end getHighest()
	
	public static void getLowest(int[] numbers)
	{
		int lowest = numbers[0];
		
		for(int index = 1; index < numbers.length; index++)
		{
			if (numbers[index] < lowest)
				lowest = numbers[index];
		}
		
		System.out.println("Lowest value is " + lowest);
		System.out.println();
	
	}//end getHighest()
}//end class