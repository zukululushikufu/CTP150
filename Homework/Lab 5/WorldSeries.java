/**
WorldSeries class
Lab 5

@author Jeffrey Wan
*/
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class WorldSeries 
{
   //private attributes
   private final int FIRST_YEAR = 1903;
   private final int FINAL_YEAR = 2016; 
   /** The number of elements in winners[] */
   private final int NUM_SERIES = ((FINAL_YEAR - FIRST_YEAR) + 1);   
   
   private String winners[];

  /**
  The WorldSeries constructor reads a file containing the list of winners from the most recent year down to the first ever World Series.
  It initializes the elements in the winners[] array to the teams listed in WorldSeriesWinners.txt
  */
   public WorldSeries() throws IOException
   {
      //object instantiations
      File worldSeriesInfo = new File("WorldSeriesWinners.txt");
      Scanner inputFile = new Scanner(worldSeriesInfo);
      winners = new String[NUM_SERIES];
      
      //check file existence
      if (!worldSeriesInfo.exists())
      {
         System.out.println("File does not exist. Closing program");
         System.exit(0);
      }
      
      //store the appropriate data in each index
      for(int index = 0; index < winners.length; index++)
      {
         this.winners[index] = inputFile.nextLine();
      }
      
      inputFile.close();
   }

   /**
   Displays all of the winners for the World Series in descending order and the years they won it
   */
   public void displayWinners() 
   {
      int year = FINAL_YEAR;
      
      for(int index = 0; index < winners.length; index++)
      {
         System.out.println(year-- + ": " + winners[index]);  
      } 
   }
   
   /**
   Displays all of the winners for the World Series in ascending order and the years they won it
   */
   public void displayWinnersByYear() 
   {  
      //variables and arrays
      int backwardsIndex = (NUM_SERIES - 1);
      int year = FIRST_YEAR;  //1903
      String[] winnersReversed = new String[NUM_SERIES];
      
      //display winners from the last element
      for(int index = 0; index < winners.length; index++)
      {
         winnersReversed[index] = winners[backwardsIndex--];
         
         System.out.println(year++ + ": " + winnersReversed[index]);
      }  
   }
   
   /**
   Displays the number of World Series titles won by the team the user is searching for
   
   @param clubName The name of the team the user wants the information on
   */
   public void findWinner(String clubName) 
   {
      //victory accumulator
      int victory = 0;
      boolean found = false;
      
      //find if the clubName exists
      for(int index = 0; index < winners.length; index++)
      {
         if(winners[index].equalsIgnoreCase(clubName))
         {
            found = true;
            break;
         }
      }
      
      //if club name exists do stuff
      if(found)
      {   
         //accumulate victories   
         for(String champions : winners)
         {
            if (champions.equalsIgnoreCase(clubName))
            {
               victory++;
            }
         }
         
         //print results
         System.out.println(clubName + " won the World Series " + victory + " times");
      }
      else
      {
         System.out.println("The team you are looking for cannot be found.");
      }
   }
   
   /**
   Displays a list of the years in which a particular team won based on the team the user is searching for
   
   @param clubName The name of the team the user wants the information on
   */
   public void findYears(String clubName) 
   {
      //indicates if the team name has been found
      boolean found = false;
      
      //find if the clubName exists
      for(int index = 0; index < winners.length; index++)
      {
         if(winners[index].equalsIgnoreCase(clubName))
         {
            found = true;
            break;
         }
      }
      
      //if team name exists, do prompt and print years
      if(found)
      {
         System.out.println("The " + clubName + " won the World Series in: ");
         
         //print out all of the years the team won
         for(int index = 0; index < winners.length; index++)
         {
            if(winners[index].equalsIgnoreCase(clubName))
            {
               System.out.println(FINAL_YEAR - index);
            }
         }
      }
      else
      {
         System.out.println("The team you are looking for cannot be found.");
      }
   }
   
   /**
   Displays the the winner of the World Series for the particular year based on the user input
   
   @param year The year the user wants to see which team won the World Series
   */
   public void winner(int year) 
   {  
      //declaring the index
      int searchIndex = (FINAL_YEAR - year);
      
      //some error handling
      if(year > FINAL_YEAR)
      {
         System.out.println("The World Series for " + year + " has not been played yet!");
      }
      else if(year < FIRST_YEAR)
      {
         System.out.println("The World Series hasn't been created yet!");
      }
      else if(winners[searchIndex].equals("NO GAME PLAYED"))
      {
         System.out.println("There was no World Series game played on " + year);
      }
      else
      {  
         System.out.println("The winner for the " + year + " World Series is the " + winners[searchIndex]);
      }
   }
   
   /**
   Reads data from the WorldSeriesFunFacts.txt file and assigns each element of the array to a particular fun fact.
   Displays a fun fact from a random element in the funFacts[] array
   */
   public void getFunFacts()  throws IOException
   {
      //variables and arrays
      final int NUM_FACTS = 29;  //total number of facts
      String[] funFacts = new String[NUM_FACTS];
      
      //objects
      File facts = new File("WorldSeriesFunFacts.txt");
      Scanner inputFile = new Scanner(facts);
      Random rand = new Random();
      
      //check for file existence
      if (!facts.exists())
      {
         System.out.println("The file does not exist. Closing Program.");
         System.exit(0);
      }
      
      //assign fun facts to array
      for(int index = 0; index < funFacts.length; index++)
      {
         funFacts[index] = inputFile.nextLine();
      }
      
      //display fun fact
      System.out.println(funFacts[rand.nextInt(28)]);
   }

}
