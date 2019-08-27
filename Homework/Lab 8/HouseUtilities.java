/**
Utilities class
Lab 8

@author Jeffrey Wan
*/

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HouseUtilities {

  
   public static void readAllHouseData(ArrayList<House> houses) throws IOException 
   {
      //instantiations
      File houseData = new File("housedatatokenized.txt");
      
      //check file existence
      if(!houseData.exists())
      {
         System.out.println("This file does not exist. Closing program.");
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(houseData);
      
      //tokenizing
      String str = "";
      String[] tokens;
      
      while (inputFile.hasNext())
      {
         str = inputFile.nextLine();
         tokens = str.split(",");
         
         String realtorName = tokens[0];
         String realtorCompany = tokens[1];
         String city = tokens[2];
         String state = tokens[3];
         double price = Double.parseDouble(tokens[4]);
         
         Realtor guy = new Realtor(realtorName, realtorCompany);
         House house = new House(guy, city, state, price);
         
         houses.add(house);
      }
      
      inputFile.close();
   }

   public static void displayAllHouseData(ArrayList<House> houses) 
   {
      for(House house : houses)
         System.out.println(house);  
   }
   
   //sequential search and displays for matching state
   public static void searchForState(ArrayList<House> houses, String state) 
   {
      boolean found = false;
      
      for(House house : houses)
      {
         if(house.getState().equalsIgnoreCase(state))
         {
            found = true;
            System.out.println(house);
         }
      }
      
      if(found == false)
      {
         System.out.println("No houses being sold in your state.");
      }
   }
   
   //sequential search and displays for all houses under maxPrice
   public static void searchForMaxPrice(ArrayList<House> houses, double maxPrice) 
   {
      boolean found = false;
      
      for(House house : houses)
      {
         if(house.getPrice() <= maxPrice)
         {
            found = true;
            System.out.println(house);
         }
      }
      
      if(found == false)
      {
         System.out.println("There are no houses below your maximum budget.");
      } 
   }

}