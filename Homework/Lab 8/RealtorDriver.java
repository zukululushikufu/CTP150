/**
Realtor Driver class
Lab 8

@author Jeffrey Wan
*/

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealtorDriver {

   public static void main(String[] args) throws IOException
   {
      //variables and instantiations
      ArrayList<House> houses = new ArrayList<House>();
      Scanner keyboard = new Scanner(System.in);
      String state = "";
      double maxPrice = 0.0;
      
      //method calls
      HouseUtilities.readAllHouseData(houses);
      HouseUtilities.displayAllHouseData(houses);
      
      System.out.print("Please enter the state you are searching for: ");
      state = keyboard.nextLine();
      HouseUtilities.searchForState(houses, state);
      
      System.out.print("Please enter the maximum price of the house you wish to purchase: ");
      maxPrice = keyboard.nextDouble();
      HouseUtilities.searchForMaxPrice(houses, maxPrice);
   }

}