/**
This program converts from US units to metric units
@author: Jeffrey Wan
@date: 1/30/19
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class UnitConverter
{
   public static void main(String[] args)
   {
      //variable declarations
      int choice = 0;
      Scanner input = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.00");
     
      //decision for conversion
      System.out.println("This program converts from US units to metric units.");
      System.out.println("Please choose from the options available: ");
      System.out.println("1. Length\n2. Volume\n3. Temperature");
      choice = input.nextInt();
      
      //processing
      switch (choice)
      {
         case 1:
            length(input, df);
            break;
         case 2:
            volume(input, df);
            break;
         case 3:
            temperature(input, df);
            break;
         default:
            System.out.println("You have entered an invalid number. Please try again.");
            System.exit(0);
            break;
      }  
   }//end main()
   
   public static void length(Scanner input, DecimalFormat df)
   {
      //local variable
      int choice = 0;
      double measurement = 0;
      double convertMeasurement = 0;
      
      //conversion
      System.out.println("Conversions options: ");
      System.out.println("1. Inches to centimeters\n2. Centimeteres to inches");
      choice = input.nextInt();
      
      switch(choice)
      {
         case 1:
            System.out.println("Enter the number of inchces: ");
            measurement = input.nextDouble();
            
            //1 inch = 2.54 cm
            convertMeasurement = measurement * 2.54;
            System.out.println(df.format(measurement) + " inches = " + df.format(convertMeasurement) + " cm");
            break;
         case 2:
            System.out.println("Enter the number of centimeters: ");
            measurement = input.nextDouble();
            
            //1cm = (1/2.54) inchces
            convertMeasurement = measurement / 2.54;
            System.out.println(df.format(measurement) + " cm = " + df.format(convertMeasurement) + " inches");
            break;
         default:
            System.out.println("You have entered an invalid number. Please try again");
            System.exit(0);
            break;
      }//end switch
   }//end length()

   public static void volume(Scanner input, DecimalFormat df)
   {
      //local variables
      int choice = 0;
      double quantity = 0;
      double convertQuantity = 0;
      
      //conversion
      System.out.println("Conversion options: ");
      System.out.println("1. gallons to liters\n2. liters to gallons");
      choice = input.nextInt();
      
      switch(choice)
      {
         case 1:
            System.out.println("Enter the number of gallons: ");
            quantity = input.nextDouble();
            
            //1 gallon = 3.78541 liters
            convertQuantity = quantity * 3.78541;
            System.out.println(df.format(quantity) + " gallons = " + df.format(convertQuantity) + " liters");
            break;
         case 2:
            System.out.println("Enter the number of liters: ");
            quantity = input.nextDouble();
            
            //1 liter = 0.264172 gallons
            convertQuantity = quantity * 0.264172;
            System.out.println(df.format(quantity) + " liters = " + df.format(convertQuantity) + " gallons");
            break;
         default:
            System.out.println("You've entered an invalid number. Please try again");
            System.exit(0);
            break;
      }//end switch
   }//end volume()
   
   public static void temperature(Scanner input, DecimalFormat df)
   {
      //local variables
      int choice = 0;
      double temp = 0;
      double convertTemp = 0;
      
      //conversion
      System.out.println("Conversion options: ");
      System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
      choice = input.nextInt();
      
      switch(choice)
      {
         case 1:
            System.out.println("Enter degrees (F): ");
            temp = input.nextDouble();
            
            convertTemp = (temp - 32.0) * (5/9);
            System.out.println(df.format(temp) + "F = " + df.format(convertTemp) + "C");
            break;
         case 2:
            System.out.println("Enter degrees (C): ");
            temp = input.nextDouble();
            
            convertTemp = (9.0/5.0) * temp + 32.0;
            System.out.println(df.format(temp) + "C = " + df.format(convertTemp) + "F");
            break;
         default:
            System.out.println("You've entered an invalid number. Please try again");
            System.exit(0);
            break;                 
      }//end switch
   }//end temperature()
}//end UnitConverter