/**
This program takes user inputs on how many cookies were eaten and reports the total calories consumed
@author: Jeffrey Wan
@date: 1/29/18
*/

/*
* Steps
* 1.) Ask them how many cookies they've eaten
* 2.) Prompt user to input number of cookies
* 3.) Calculate total number of calories
* 4.) Display total calories consumed
*/

import java.util.Scanner;

public class CookieCalories
{
   public static void main(String[] args)
   {
      //constant
      final double COOKIECALORIES = ((10.0 * 300.0) / 40.0);   //75.0 calories per cookie
      
      //variable declarations
      int cookiesEaten = 0;
      double totalCalories = 0;
      
      Scanner input = new Scanner(System.in);
      
      //intro and inputs
      System.out.println("This program calculates the total calories consumed based on the number of cookies eaten.");
      System.out.println("Please enter the number of cookies you have eaten: ");
      cookiesEaten = input.nextInt();
      
      //input validation
      while (cookiesEaten < 0)
      {
         System.out.println("You have entered an invalid amount. Please try again: ");
         cookiesEaten = input.nextInt();   
      }
      
      //processing
      totalCalories = cookiesEaten * COOKIECALORIES;
      
      //output
      System.out.println("Total calories consumed: " + totalCalories);
   }//end main
}
