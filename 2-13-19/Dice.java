/**
Simulates the roll of a dice
File 4
@author Jeffrey Wan
@date 2/13/19
*/
import java.util.Scanner;
import java.util.Random;

public class Dice
{
	public static void main(String[] args)
	{
		//variables and instatiations
		String again = "y";
		int die1 = 0;
		int die2 = 0;
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		//simulate dice roll
		while(again.equalsIgnoreCase("y"))
		{
			System.out.println("Rolling the dice....");
			die1 = rand.nextInt(6) + 1;	//index starts at 0 so we need to add 1
			die2 = rand.nextInt(6) + 1;
			
			//display results
			System.out.println(die1 + " " + die2);
			
			//prompt to continue
			System.out.println("Do you want to roll again? (Y/N)");
			again = input.nextLine();	
		}
	
	}//end main()
}//end Dice