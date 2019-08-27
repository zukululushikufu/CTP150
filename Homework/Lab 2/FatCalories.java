/**
This program displays the percentage of calories from fat and displays
a message as to whether or not the item is low in fat
@author: Jeffrey Wan
@date: 1/30/19
*/

/*Notes
*  Each gram of fat is 9 calories
*  The percentage of calories from fat can be calculated by dividing 
*  the calories from the fat by the total number of calories
*  A food item that contains less than 30 percent fat caloriesis considered low fat
*  Number of calories from fat must never exceed total calories
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class FatCalories
{
   public static void main(String[] args)
   {
      //constants
      final double CALORIES_PER_FAT = 9.0;  //Each gram of fat is 9 calories
      
      //variables
      double totalCalories = 0.0;
      double fatGrams = 0.0;
      double fatCalories = 0.0;  //Total calories from fat in our food item
      double fatCaloriesPercent = 0.0;
      
      Scanner input = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.00");
          
      //prompts and inputs
      System.out.println("This program gets the total number of calories and the number of fat grams "
                       + "in the food item, calculates fat calories percentage,\nand determines and displays if the item is low fat\n");
      //get total calories
      System.out.println("Enter the total number of calories in your food item: ");
      totalCalories = input.nextDouble();
      
      //get grams of fat
      System.out.println("Enter the total grams of fat present in your food item: ");
      fatGrams = input.nextDouble();
      
      //processing
      //calculate calories from our grams of fat
      fatCalories = fatGrams * CALORIES_PER_FAT; 
      
      fatCaloriesPercent = (fatCalories / totalCalories) * 100;
      
      //checking for valid fat calories amoun
      if (fatCalories > totalCalories)
      {
         System.out.println("You calories from fat exceeds the total calories. Try again.");
         System.exit(0);
      }
      
      if (fatCaloriesPercent < 30.0)
         System.out.println("This is a low fat food with only " + df.format(fatCaloriesPercent) + "% fat.");
      else
         System.out.println("This food is not low fat with " + df.format(fatCaloriesPercent) + "% fat.");
   }//end main
}//end FatCalories
