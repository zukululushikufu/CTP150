/**
Company Driver
Lab 6

@author Jeffrey Wan
*/
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class CompanyDriver 
{
   /**
   The main method runs the program
   
   @param args Command line arguments
   */
   public static void main(String[] args) throws IOException 
   {
      //instantiations and a variable
      ArrayList<Company> companyData = new ArrayList<Company>();
      Scanner keyboard = new Scanner(System.in);
      int option = 0;
      
      //fill array list
      setCompanyData(companyData);
      
      //menu
      do
      {
         System.out.println("\nThis program can display and sort the data for 10 particular companies.");
         System.out.println(  "1.) Display all company data\n" + 
                              "2.) Sort data\n" +
                              "3.) Exit");
         System.out.print("Select an option: ");
         option = keyboard.nextInt();
         
         switch(option)
         {
            case 1:
               displayCompanyData(companyData);
               break;
            case 2:
               sortData(keyboard, companyData);
               break;
            case 3:
               System.out.println("Closing program");
               System.exit(0);
            default:
               System.out.println("Invalid option input.");
         }
      }while(option != 3);
   }
   
   /**
   setCompanyData() reads a file, stores the company symbol, name, previous and current
   stock prices in variables, and  these variables are used to instantiate Company
   objects with the appropriate attributes which are finally added to an ArrayList that was passed into this method
   
   @param company An ArrayList that holds Company reference variables
   */
   public static void setCompanyData(ArrayList<Company> company) throws IOException
   {
      //instantiates
      File companyInfo = new File("CompanyData.txt");
      Scanner inputFile = new Scanner(companyInfo);
      int index = 0;
      
      while(inputFile.hasNextLine())
      {
         String symbol = inputFile.nextLine();
         String name = inputFile.nextLine();
         double previousPrice = Double.parseDouble(inputFile.nextLine());
         double currentPrice = Double.parseDouble(inputFile.nextLine());
                
         company.add(new Company(symbol, name));
         company.get(index).setPreviousPrice(previousPrice);
         company.get(index).setCurrentPrice(currentPrice);
         
         index++;
      }
   }
   
   /**
   Iterates through the ArrayList passed into this method and displays all
   company information by calling the toString() using System.out.println()
   
   @param company An ArrayList that holds Company reference variables
   */
   public static void displayCompanyData(ArrayList<Company> company)
   {
      for(Company info: company)
      {
         System.out.println(info);
      }
   }
   
   /**
   Gives the user two sorting options
   1.) Sorting the company names in ascending order
   2.) Sorting companies in ascending order based on the current price of their stocks
   
   @param keyboard A Scanner object that takes user input from the keyboard
   @param company An ArrayList that holds Company reference variables
   */
   public static void sortData(Scanner keyboard, ArrayList<Company> company)
   {
      //prompt to choose option
      System.out.println(  "1.) Sort name in ascending order\n" + 
                           "2.) Sort current price in ascending order");
      int option = keyboard.nextInt();
      
      switch(option)
      {
         case 1:  //sort name 
            //temporary variable to hold Company object
            Company temp;
            
            //bubble sort loop
            for(int index = 0; index < (company.size() - 1); index++)
            {
               for(int i = 1; i < company.size(); i++)
               {
                  if(company.get(i - 1).getName().compareToIgnoreCase(company.get(i).getName()) > 0)
                  {
                     temp = company.get(i - 1);
                     company.set((i - 1), company.get(i));
                     company.set(i, temp);
                  }
               }
            }
            displayCompanyData(company);
            break;
         case 2:  //sort current price
            //temporary variable to hold a Company object
            Company temporary;
            
            //bubble sort loop
            for(int index = 0; index < (company.size() - 1); index++)
            {
               for(int i = 1; i < company.size(); i++)
               {
                  if(company.get(i - 1).getCurrentPrice() > company.get(i).getCurrentPrice())
                  {
                     temporary = company.get(i - 1);
                     company.set((i - 1), company.get(i));
                     company.set(i, temporary);
                  }
               } 
            }
            displayCompanyData(company);
            break;
         default:
            System.out.println("Invalid option input.");
            break;  
      }//end switch
   }//end sortData()

}