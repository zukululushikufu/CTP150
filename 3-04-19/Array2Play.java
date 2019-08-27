/**
This program will look at arrays
File 1

@author Jeffrey
date: 3/4/19
*/
import java.util.Scanner;

public class Array2Play
{
	public static void main(String[] args)
	{
		//variables and arrays
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = new int[array1.length];
		
		//displays		
		System.out.println("Array 1: ");
		displayInt(array1);
		
		System.out.println("Doubled array 1: ");
		doubleInt(array1);
		
		System.out.println("Array 2: ");
		displayInt(array2);
		
		//copies array1 into array2
		for (int index = 0; index < array2.length; index++)
		{
			array2[index] = array1[index];
		}
		
		System.out.println("After copying array1 into array2");
		displayInt(array2);
		
		int[] array3 = copyArray(array2);
		System.out.println("Array 3");
		displayInt(array3);
		
	}//end main()
	
	public static void displayInt(int[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			System.out.println(array[index]);
		}
	}//end displayInt(int[])
	
	public static void doubleInt(int[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			//doubling the elements
			array[index] *= 2;
			
			//display results
			System.out.println(array[index]);
		}
	}//end doubleInt(int[])
	
	public static int[] copyArray(int[] original)
	{
		//declare an array to copy to
		int[] newArray = new int[original.length];
		
		//copying
		for(int index = 0; index < original.length; index++)
		{
			newArray[index] = original[index];
		}
		
		//return
		return newArray;
	}
	
}//end Array2Play
