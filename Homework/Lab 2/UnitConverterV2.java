/**
Unit Converter V2
@author: Jeffrey Wan
*/
import java.util.Scanner;

public class UnitConverterV2
{
   public static void main(String[] args)
   {
      //variables
      String choice = "";
      String choice2 = "";
      String choiceMerge = "";   //Merges choice and choice2 into 1 number for switch in getQuantity()
      double quantity = 0;
      double convertedQuantity = 0;
      
      Scanner input = new Scanner(System.in);
      
      //menu
      System.out.println("This program obtains a measurement and converts them "
                     + "according to the options you have selected.");
      System.out.println("Quantity options: ");
      System.out.println("1. Length\n2. Volume\n3. Temperature");
      choice = input.nextLine();
      
      switch(choice)
      {
         case "1":
            System.out.println("Conversion options: ");
            System.out.println("1. Inches to centimeters\n2. Centimeters to inches");
            choice2 = input.nextLine();
            break;
         case "2":
            System.out.println("Conversion options: ");
            System.out.println("1. Gallons to liters\n2. Liters to gallons");
            choice2 = input.nextLine();
            break;
         case "3":
            System.out.println("Conversion options: ");
            System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
            choice2 = input.nextLine();
            break;
         default:
            System.out.println("Invalid entry. Please try again");
            System.exit(0);
            break;
      }//end switch
      
      choiceMerge = choice + choice2;
      
      //processing
      quantity = getQuantity(input, choiceMerge);
      convertedQuantity = convertQuantity(choiceMerge, quantity);
      
      //print results
      printResults(choiceMerge, quantity, convertedQuantity);   
   }//end main()
   
   public static double getQuantity(Scanner input, String choiceMerge)
   {
      //local variables
      String units = "";
      double quantity = 0;
      
      //switch to determine which units to add to our prompt
      //"11" means choice = 1, choice2 = 1. Selection would be: 1. Length, 1. Inches to centimeters
      switch(choiceMerge)
      {
         case "11":
            units = "inches";
            break;
         case "12":
            units = "centimeters";
            break;
         case "21":
            units = "gallons";
            break;
         case "22":
            units = "liters";
            break;
         case "31":
            units = "Fahrenheit";
            break;
         case "32":
            units = "Celsius";
            break;
         default:
            System.out.println("Invalid entry. Please try again");
            System.exit(0);
            break;
      }//end switch
      //quantity input prompt
      System.out.println("Please enter the number of " + units);
      quantity = input.nextDouble();
      
      return quantity;
   }//end getQuantity()
   
   public static double convertQuantity(String choiceMerge, double quantity)
   {
      //variable
      double convertedQuantity = 0;
      
      //conversion
      switch(choiceMerge)
      {
         case "11":
            //inches to cm
            convertedQuantity = quantity *2.54;
            break;
         case "12":
            //cm to inches
            convertedQuantity = quantity / 2.54;
            break;
         case "21":
            //gallons to liters
            convertedQuantity = quantity * 3.78541;
            break;
         case "22":
            //liters to gallons
            convertedQuantity = quantity * 0.264172;
            break;
         case "31":
            //fahrenheit to celsius
            convertedQuantity = (quantity - 32.0) * (5.0/9.0);
            break;
         case "32":
            //celsius to fahrenheit
            convertedQuantity = (9.0/5.0) * quantity + 32.0;
            break;
         default:
            System.out.println("Invalid entry. Please try again.");
            System.exit(0);
            break;
      }//end switch
      
      return convertedQuantity;
   }//end convertQuantity()
   
   public static void printResults(String choiceMerge, double quantity, double convertedQuantity)
   {
      switch(choiceMerge)
      {
         case "11":
            System.out.println(quantity + " inches = " + convertedQuantity + " cm");
            break;
         case "12":
            System.out.println(quantity + " cm = " + convertedQuantity + " inches");
            break;
         case "21":
            System.out.println(quantity + " gallons = " + convertedQuantity + " liters");
            break;
         case "22":
            System.out.println(quantity + " liters = " + convertedQuantity + " gallons");
            break;
         case "31":
            System.out.println(quantity + "F = " + convertedQuantity + "C");
            break;
         case "32":
            System.out.println(quantity + "C = " + convertedQuantity + "F");
            break;
         default:
            System.out.println("Invalid entries. Please try again");
            System.exit(0);
            break;
      }
   }//end printResults

}//end UnitConverterV2