/**
Rainfall Driver
File 5

@author Jeffrey Wan
date: 2/27/19
*/
import java.util.Scanner;
import java.io.*;

public class RainfallDriver1
{
  	public static void main(String[] args) throws IOException
  	{
		//instantions
		File rainfallInfo = new File("rainfall.txt");
		Scanner inputFile = new Scanner(rainfallInfo);
		Scanner keyboard = new Scanner(System.in);
		
		//variables
		String location = "";
		double[] rainfall = new double[12];
		int option = 0;
		
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
		
		//menu
		inputFile.nextLine();
		System.out.println("Pick a Rainfall option: 1.) Get average, 2.) Get max, 3.) Get min");
		option = keyboard.nextInt();
		
		switch(option)
		{
			case 1:
				System.out.printf("Average: %.2f cm", rainfall1.getAverage());
				break;
			case 2:
				System.out.printf("Max rainfall: %.2f cm", rainfall1.getMax());
				break;
			case 3:
				System.out.printf("Min rainfall: %.2f cm", rainfall1.getMin());
				break;
			default:
				System.out.println("Option index out of bounds. Enter a number numbers from 1 - 3: ");
				System.exit(0);
				break;
		}
		
		
  	}//end main()
}//end RainfallDriver