/**
Language Driver class
File 2

@author Jeffrey Wan
Date: 3/11/19
*/

/*	Notes
*	This class does have a static method
*/

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class LanguageDriver 
{
  	public static void main(String[] args) throws IOException
  	{
		//read
  		readData();
		
		//add a new developer
		Developer d1 = new Developer("Mark Zuckerberg", "FaceBook");
		System.out.println(d1);
		System.out.println(d1.getInstanceCount());
		
		Developer d2 = new Developer("JavaScript Brendan Eich", "Netscape Communications Corp.");
		
		//compare d1 and d2
		if(d1.equals(d2))
		{
			System.out.println("Both developers are the same");
		}
		else
		{
			System.out.println("The developers are different.");
		}
		
		//copying
		Developer d3 = new Developer(d2);	//passing a d2 Developer reference variable to call the copy constrcutor
		
		//compareing d3 and d2
		if(d3.equals(d2))
		{
			System.out.println("Both developers are the same");
		}
		else
		{
			System.out.println("The developers are different.");
		}
  	}//end main()

  	public static void readData() throws IOException 
	{
		File developerInfo = new File("developers.txt");
		
		//check file existence
		if(!developerInfo.exists())
		{
			System.out.println("File does not exist");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(developerInfo);
		
		//variables
		String name = " ";
		String company = " ";
		int count = 0;
		
		//read file
		while(inputFile.hasNext())
		{
			name = inputFile.nextLine();
			company = inputFile.nextLine();
			
			//bundle up info into an object
			Developer dev = new Developer(name, company);
			
			//print
			System.out.println(dev);
			
			//increment count done with instantiation
			count = dev.getInstanceCount();
		}
		
		System.out.println("\nNumber of instances created: " + count);
		
  	}//end readData()

}//end LanguageDriver