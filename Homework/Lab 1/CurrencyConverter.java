/**
This program converts USD to other currencies
@author: Jeffrey Wan
@date: 1/29/19
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter
{
   public static void main(String[] args)
   {
      //constants
      //Each US $1 is equal to:
      final double EURO = 0.880566;
      final double POUND = 0.767294;
      final double AUD = 1.40303;
      final double CAD = 1.33420;
      final double NZD = 1.47444;
   
      //variable declarations
      double amountToConvert = 0;
      double usdToEuro = 0;
      double usdToPound = 0;
      double usdToAUD = 0;
      double usdToCAD = 0;
      double usdToNZD = 0;
      
      Scanner input = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.00");
      
      //inputs and prompts
      System.out.println("This program converts a desired amount of USD to other currencies.");
      System.out.println("Enter the amount you wish to convert: ");
      amountToConvert = input.nextDouble();
      
      //input validation
      while (amountToConvert < 0)
      {
         System.out.println("You have entered an invalid amount. Please try again: ");
         amountToConvert = input.nextDouble();
      }
      
      //processing
      usdToEuro   = amountToConvert * EURO;
      usdToPound  = amountToConvert * POUND;
      usdToAUD    = amountToConvert * AUD;
      usdToCAD    = amountToConvert * CAD;
      usdToNZD    = amountToConvert * NZD;
      
      //output
      System.out.println("$" + df.format(amountToConvert) + " converts to: ");
      System.out.println("-------------------");
      System.out.println("Euro: \t" + df.format(usdToEuro));
      System.out.println("Pound: \t" + df.format(usdToPound));
      System.out.println("AUD: \t\t" + df.format(usdToAUD));
      System.out.println("CAD: \t\t" + df.format(usdToCAD));
      System.out.println("NZD: \t\t" + df.format(usdToNZD));
   }
}