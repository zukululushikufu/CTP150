/**
Read the file
File 2
@author Jeffrey Wan
@date 2/13/19
*/

import java.util.Scanner;
import java.io.*;

public class FileReadDemo
{
	public static void main(String[] args) throws IOException
	{
		//variable declarations and instantiations
		Scanner input = new Scanner(System.in);
		String fileName = "";
		int counter = 0;	//accumulator variable to count how many records we have
		
		//get the name of the file
		System.out.println("Enter your file name: ");
		fileName = input.nextLine();
		
		//open file
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		//read the file until no more records
		while (inputFile.hasNext())	//hasNext() determines if we have more records in our file and returns an oppropriate boolean value
		{
			
			String friendName = inputFile.nextLine();
			
			//display it
			System.out.println(friendName);
			
			//increment our counter for each record we have
			counter++;
		}
		
		inputFile.close();	//close file
		System.out.println(counter + " names are in the file.");
	}//end main()
}//end FileReadDemo