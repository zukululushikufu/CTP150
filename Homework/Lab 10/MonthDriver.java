/**
Lab  10 - MonthDriver class

@author Jeffrey Wan
*/

import java.util.*;

public class MonthDriver
{
   public static void main(String[] args)
   {
      //variables
      String cont = " ";
      String monthName = " ";
      int monthNum = 0;
      int option = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      //menu for testing options
      do
      {
         System.out.println("\nSelect one of the following options: ");
         System.out.println("1.) Test month numbers" +
                            "\n2.) Test month names");
                            
         System.out.print("Enter option: ");
         try
         {
            option = keyboard.nextInt();
            keyboard.nextLine();
         }
         catch(InputMismatchException e)
         {
            System.out.println("Please enter an integer number");
            option = 0;
         }
         
         while(option <= 0 || option > 2)
         {
            System.out.println("Invalid option entry. Please enter either 1 or 2: ");
            
            try
            {
               option = keyboard.nextInt();
               keyboard.nextLine();
            }
            catch(InputMismatchException e)
            {
               System.out.println("Please enter an integer number");
            }
         }  
         
         if(option > 0)
         {
            switch(option)
            {
               case 1:  //test month number
                  System.out.print("Please enter a month number: ");
                  
                  //catch invalid data type inputs and invalid months
                  try
                  {
                     monthNum = keyboard.nextInt();
                     keyboard.nextLine();
                     Month month = new Month(monthNum);
                     
                     //display month
                     System.out.println(month);
                  }
                  catch(InputMismatchException e)
                  {
                     System.out.println("Invalid number data type. Please enter an integer"); 
                  }
                  catch(InvalidMonthException e)
                  {
                     e.getMessage();
                  }
                  break;
               case 2:  //test month name
                  System.out.print("Please enter a month name: ");
                  
                  try
                  {
                     monthName = keyboard.nextLine();
                     Month month = new Month(monthName);
                     
                     //display month
                     System.out.println(month);
                  }
                  catch(InvalidMonthException e)
                  {
                     e.getMessage();
                  }
                  break;
               default:
                  System.out.println("Invalid option entry. Enter either 1 or 2");
                  break;    
            }//end switch
         }
         
         //prompt to continue
         System.out.println("Would you like to continue? (Y/N)");
         cont = keyboard.nextLine().toLowerCase();
      }while(cont.charAt(0) == 'y');
   }//end main()
}//end class