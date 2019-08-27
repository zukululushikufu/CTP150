/**
Array and Arraylist review
File 3

@author Jeffrey Wan
Date: 3/11/19
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Movies
{
	//attribute
	private ArrayList<String> movieTitles;
	
	public Movies()
	{
		//just an empty array list
		movieTitles = new ArrayList<String>();
	}
	
	public Movies(ArrayList<String> titles)
	{
		this.movieTitles = titles;
	}
	
	public void readData() throws IOException
	{
		//instantiates
		File movieInfo = new File("Movies1D-1");
		
		//check file existence
		if(!movieInfo.exists())
		{
			System.out.println("The file does not exist");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(movieInfo);
		
		//variable
		String title = " ";
		int i = 0;
		
		//display header
		title = inputFile.nextLine();
		System.out.println(title);
		
		//read from file and display
		while(inputFile.hasNextLine())
		{
			title = inputFile.nextLine();
			movieTitles.add(title);
			i++;
		}
		
		//close file
		inputFile.close();
	}//end readData()
	
	public void displayData()
	{
		for(int index = 0; index < movieTitles.size(); index++)
		{
			System.out.println(movieTitles.get(index));
		}
	}//end displayData()

}//end movies