/**
Rainfall Driver
File 3

@author Jeffrey Wan
date: 2/27/19
*/
import java.util.Scanner;
import java.io.*;

public class RainfallDriver 
{
  	public static void main(String[] args) throws IOException
  	{
		//instantions
		File rainfallInfo = new File("rainfall.txt");
		Scanner inputFile = new Scanner(rainfallInfo);
		
		//variables
		String location = "";
		double[] rainfall = new double[12];
		
		//check for file existence
		if(!rainfallInfo.exists())
		{
			System.out.println("File does not exist");
			System.exit(0);
		}
		
		//read file
		//get location
		location = inputFile.nextLine();
		System.out.println(location);
		
		//get rainfall
		for (int index = 0; index < rainfall.length; index++)
		{
			rainfall[index] = inputFile.nextDouble();
			
			//if we have a negative rainfall, set that value for the index to 0
			while (rainfall[index] < 0)
			{
				System.out.println(Utilities.toMonthName(index + 1) + rainfall[index] + "This figure is negative, moving 0 to data");
				rainfall[index] = 0;
			}
		}
		
		//printing info
		Rainfall rainfall1 = new Rainfall(location, rainfall);
		System.out.println(rainfall1);
		
  	}//end main()
}//end RainfallDriver