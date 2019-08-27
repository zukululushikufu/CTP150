/**
Lab 3 - Question 2
Assateague rainfall data stored in file named: rainfallassateague
New file can be created if desired
@author Jeffrey Wan
*/
import java.util.Scanner;
import java.io.*;

public class RainfallAssateague
{
   public static void main(String[] args) throws IOException
   {
      //variables and objects
      String fileName = "";
      double maxRainfall = 0;
      double totalRainfall = 0;
      int aboveAverageRainfall = 0; //number of months avg rain > 4 inches
      
      Scanner keyboard = new Scanner(System.in);
      
      //get file name
      System.out.println("Enter the file name: ");
      fileName = keyboard.nextLine().toLowerCase();
      
      //instantiating File object
      File rainfallFile = new File(fileName);
      
      //check for file existence
      if (!rainfallFile.exists())
      {
         System.out.println("File does not exist. Begining file creation.");
         
         //write the file
         makeFile(fileName, keyboard);
      }
      else
      {
         System.out.println("The file exists. Continuing with program.");
      }
      
      //read data from file
      //getting max rainfall
      maxRainfall = getMaxRainfall(rainfallFile);
      
      //getting total rainfall
      totalRainfall = getTotalRainfall(rainfallFile);
      
      //getting number of months avg rainfall > 4 inches
      aboveAverageRainfall = getAbvAvgRainfall(rainfallFile);
      
      //printing results
      System.out.println("Highest average rainfall: " + maxRainfall);
      System.out.println("Total rainfall for the year: " + totalRainfall);
      System.out.println("Number of months average rainfall was more than 4 inches: " + aboveAverageRainfall);
      
   }//end main()
   
   /**
   If the file does not exist this method will create and write the file
   with the passed in file name.
   @param fileName File name as decided by the user. Necessary to instantiate PrintWriter.
   @param keyboard Used to get input
   */
   public static void makeFile(String fileName, Scanner keyboard) throws IOException
   {
      //variables and objects
      int numEntries = 0;
      
      //write file
      PrintWriter outputFile = new PrintWriter(fileName);
      
      //get the number of entries
      System.out.println("Enter the number of entries: ");
      numEntries = keyboard.nextInt();
      
      //write into file
      for (int month = 1; month <= numEntries; month++)
      {
         System.out.println("Enter the amount of rainfall for month " + month + ": ");
         double rainfall = keyboard.nextDouble();
         
         outputFile.println(rainfall);
      }
      
      outputFile.close();
      System.out.println("Data written to file.");
   }//end makeFile()
   
   /**
   Used to read the rainfallAssateague file and obtain the highest average rainfall
   @param rainfallFile Represents the rainfallassateague file and passed into Scanner to be read
   @return the value for the highest average rainfall
   */
   public static double getMaxRainfall(File rainfallFile) throws IOException
   {
      //variables
      double nextEntry = 0;
      double maxRainfall = 0;
      Scanner inputFile = new Scanner(rainfallFile);
      
      //getting max value
      while(inputFile.hasNext())
      {
         nextEntry = inputFile.nextDouble();
         
         if(nextEntry > maxRainfall)
            maxRainfall = nextEntry;
      }
      
      inputFile.close();
      return maxRainfall;
   }//end getMaxRainfall()
   
   /**
   Accumulates monthly rainfall into a variable called totalRainfall
   @param rainfallFile Represents the rainfallassateague file and passed into Scanner to be read
   @return the total annual rainfall based on the data read in rainfallassateague
   */
   public static double getTotalRainfall(File rainfallFile) throws IOException
   {
      //variables
      double totalRainfall = 0;  //accumulator
      double nextEntry = 0;
      
      Scanner inputFile = new Scanner(rainfallFile);
      
      while (inputFile.hasNext())
      {
         nextEntry = inputFile.nextDouble();
         
         //accumulate
         totalRainfall += nextEntry;
      }
      
      inputFile.close();
      return totalRainfall;
   }//end getTotalRainfall()
   
   /**
   Read as Above Average Rainfall this method counts how many months had an average
   rainfall of more than 4 inches
   @param rainfallFile Represents the rainfallassateague file and passed into Scanner to be read
   @return the number of months average rainfall was greater than 4 inches
   */
   public static int getAbvAvgRainfall(File rainfallFile) throws IOException
   {
      int numMonths = 0;   //increments if rainfall > 4 inches
      double nextEntry = 0;
      Scanner inputFile = new Scanner(rainfallFile);
      
      while (inputFile.hasNext())
      {
         nextEntry = inputFile.nextDouble();
         
         if (nextEntry > 4.0)
            numMonths++;
      }
      
      inputFile.close();
      return numMonths;
   }
}//end RainfallAssateague