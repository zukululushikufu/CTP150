/**
World series driver
Lab 5

@author Jeffrey Wan
*/
import java.util.Scanner;
import java.io.*;

public class WorldSeriesDriver 
{
   public static void main(String[] args) throws IOException
   {
      //instantiate object
      WorldSeries ws = new WorldSeries();
      Scanner keyboard = new Scanner(System.in);
      
      //variables
      int option = 0;
      int year = 0;
      String clubName = "";
      
      //loops the menu unless terminated by user
      do
      {
         //menu
         System.out.println("\nThis program gives you information on the teams that won the World Series in baseball.");
         System.out.println("Please select one of the following options: ");
         System.out.println("1.) Show all winners - descending years\n" + "2.) Show all winners - ascending years\n" +
                             "3.) Show how many times a particular team has won\n" +
                             "4.) Show the years that a particular team has won\n" +
                             "5.) Show the winner for a particular year\n" +
                             "6.) Exit");
         ws.getFunFacts(); //show fun facts
                                      
         //menu option input
         System.out.print("Enter option: ");
         option = keyboard.nextInt();                     
         keyboard.nextLine(); 
         
         //execute option                        
         switch(option)
         {
               case 1:
                  ws.displayWinners();
                  break;
               case 2:
                  ws.displayWinnersByYear();
                  break;
               case 3:
                  System.out.print("Enter the club name: ");
                  clubName = keyboard.nextLine();
                  ws.findWinner(clubName);
                  break;
               case 4:
                  System.out.print("Enter the club name: ");
                  clubName = keyboard.nextLine();
                  ws.findYears(clubName);
                  break;
               case 5:
                  System.out.print("Enter the year: ");
                  year = keyboard.nextInt();
                  keyboard.nextLine(); //eats newLine
                  ws.winner(year);
                  break;
               case 6:
                  System.out.println("Closing Program");
                  System.exit(0);
                  break;
               default:
                  System.out.println("Invalid option number. Try again.");
                  break;     
         }//end switch
      }while(option != 6);
   }

}