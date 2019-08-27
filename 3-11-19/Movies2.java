/**
Array and Arraylist review
File 5

@author Jeffrey Wan
Date: 3/11/19
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Movies2
{
	//attribute
	private ArrayList<String> movieTitles;
	private final int NUM_RATINGS = 11;	//constant
	private int[] ratings = new int[NUM_RATINGS];
	
	public Movies2()
	{
		//just an empty array list
		movieTitles = new ArrayList<String>();
		ratings = new int[NUM_RATINGS];
		for (int index = 0; index < ratings.length; index++)
		{
			ratings[index] = 0;
		}
	}
	
	public Movies2(ArrayList<String> titles, int[] array)
	{
		this.movieTitles = titles;
		for(int index = 0; index < ratings.length; index++)
		{
			ratings[index] = array[index];
		}
	}
	
	public void readData() throws IOException
	{
		//instantiates
		File movieInfo = new File("Movies2");
		
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
			ratings[i] = Integer.parseInt(inputFile.nextLine());
			
			movieTitles.add(title);
			i++;
		}
		
	}//end readData()
	
	public void displayData()
	{
		for(int index = 0; index < movieTitles.size(); index++)
		{
			System.out.println(movieTitles.get(index));
			System.out.println(ratings[index]);
		}
	}//end displayData()

}//end movies