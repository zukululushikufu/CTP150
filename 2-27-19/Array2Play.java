/**
Array testing
File 1
@author Jeffrey Wan
date : 2/27/19
*/

import java.util.Scanner;

public class Array2Play
{
	public static void main(String[] args)
	{
		//object instantiate
		Scanner keyboard = new Scanner(System.in);
		
		//array instantiations
		char[] charArray = new char[10];	//an array of characters containing 10 elements
		System.out.println("The character array: " + charArray[0]);
		//System.out.println("The character array: " + charArray[10]); gives us an indexOutOfBoundsException since 10 is beyond the index we can access
		
		
		String[] strArray = new String[10];
		System.out.println("The String array: " + strArray[0]);	//with nothing assigned in strArray the elements are filled with nulls
		System.out.println("The String array: " + strArray[9]);
		
		double[] doubleArray = new double[5];
		System.out.println("The double array: " + doubleArray[0]);
		System.out.println("The double array: " + doubleArray[4]);
		
		//--------------------------------------------------------------------------------------------------------------------------------------------------
				
		//testing more String arrays
		String[] names = {"Barney", "Fred", "Wilma", "Pebbles", "Bam Bam", "Dino", "Betty"};
		System.out.println("Number of names: " + names.length);
		
		//sequential search using a for loop
		System.out.println("What name are you looking for: ");
		String oneName = keyboard.nextLine();
		
		boolean found = false;
		
		for(int index = 0; index < names.length; index++)
		{
			if (oneName.equalsIgnoreCase(names[index]))
			{
				System.out.println("Your name was found at position " + (index + 1));
				found = true;
			}
		}
		
		if (!found)
			System.out.println("Your name is not in the list");
		
		//using a while loop
		found = false;
		int i = 0;
		
		while(i < names.length && !found)
		{
			if (oneName.equalsIgnoreCase(names[i]))
			{
				System.out.println("Your name was found at position " + (i + 1));
				found = true;
			}
			i++;
		}//end while
		
		if (!found)
			System.out.println("Your name is not in the list");
			
		//search using a conditional loop
		found = false;
		for(String aName: names)
		{
			if (oneName.equalsIgnoreCase(aName) && !found)
			{
				System.out.println("Your name was found");
				found = true;
			}
		}		
		
		if (!found)
			System.out.println("Your name is not in the list");
			
		//--------------------------------------------------------------------------------------------------------------------------------------------------
		
		//partially filled arrays
		int[] grades = new int[10];
		int count = 0;
		
		System.out.println("Enter your first grade or enter (-99) to exit the program: ");
		int grade = keyboard.nextInt();
		
		while (grade != -99 && count < grades.length)	//do not exceed 10 iterations
		{
			grades[count] = grade;
			count++;
			
			if (count == grades.length)
				break;
			else
			{
				System.out.println("Enter your next grade or enter (-99) to exit the program: ");
				grade = keyboard.nextInt();
			}
		}//end while
		
		System.out.println("Number of grades: " + count);
		
		for(int eachGrade : grades)
			System.out.println(eachGrade);
			
		double sum = 0;
		for(int index = 0; index < count; index++)
		{
			sum += grades[index];
		}
		
		double avg = sum/count;
		
		System.out.printf("Average score: %.2f", avg);
		
					
	}//end main()
}//end Array2Play




/*	Note
*	Array list has changeable size
*	
*/

