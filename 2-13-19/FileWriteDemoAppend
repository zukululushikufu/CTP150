/**
This file will append to the file
File 1
@author Jeffrey Wan
@date 2/13/19
*/

import java.util.Scanner;
import java.io.*;

/*	Notes
* 	Append means to add on to the end
*	FileWriter opens the file and if you want to append it will append to the file
*	FileWriter reads
*	PrintWriter to write to file
*/

public class FileWriteDemoAppend
{
	public static void main(String[] args) throws IOException	//allows Java to to throw errors pertaining to my files
	{
		//variable names
		String fileName = "";
		String friendName = "";
		int numFriends = 0;
		String question = "";	//stores the string/character that determines if we append or not
		char ch = ' ';
		
		Scanner input = new Scanner(System.in);
		
		//prompts and inputs
		System.out.println("How many friends do you have?");
		numFriends = input.nextInt();
		input.nextLine();	//consumes next line character
		
		System.out.println("Enter the file name: ");
		fileName = input.nextLine();
		
		//creating and writing into file
		File file = new File(fileName);
		
		//check if file name exists and asks user if they want to append or add onto the existing file
		if (file.exists())
		{
			System.out.println("The file " + fileName + " already exists.");
			System.out.println("Do you want to append or add on? (Y/N)");
			question = input.nextLine().toUpperCase();
			
			if (question.charAt(0) == 'Y')
			{
				System.out.println("Add more data to the file: ");
				appendFile(file);
			}
			else
				System.exit(0);
		}//end file checking/appending	
		
		//creates a PrintWriter object that allows us to write into a file
		PrintWriter outputFile = new PrintWriter(file);
		
		for(int i = 1; i <= numFriends; i++)
		{
			System.out.println("Enter the name of the friend number " + i + ":");
			friendName = input.nextLine();
			
			outputFile.println(friendName);
		}
		
		outputFile.close();	//closes outputFile
		System.out.println("Data has been written into the file");
	}//end main()
	
	//fileName is what we passed into the File() constructor
	public static void appendFile(File fileName) throws IOException
	{
		//instantiations and variable declarations
		Scanner scan = new Scanner(System.in);
		FileWriter writer = new FileWriter(fileName, true);
		PrintWriter outputFile = new PrintWriter(writer);
		
		String friendName = "";
		int numFriends = 0;
		
		//getting input to append to file
		System.out.println("How many friends do you have?");
		numFriends = scan.nextInt();
		scan.nextLine();	//consume next line character
		
		for (int i = 1; i <= numFriends; i++)
		{
			System.out.println("Enter the name of friend number " + i + ":");
			friendName = scan.nextLine();
			
			outputFile.println(friendName);
		}
		
		outputFile.close();
		System.exit(0);
	}//end appendFile()
}//end FileWriteDemoAppend
