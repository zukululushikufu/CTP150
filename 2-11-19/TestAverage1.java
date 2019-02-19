/**
This program will use a do while loop for a user controlled data
File 4
@author Jeffrey Wan
@date 2/11/19
*/

import java.util.Scanner;

public class TestAverage1
{
	public static void main(String[] args)
	{	
		//variable declarations
		int score1, score2, score3;
		double average = 0;
		char repeat = ' ';
		String input = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("The program averages test scores.");
		
		//using a do-while loop
		do
		{
			//get all scores
			System.out.println("Enter score 1: ");
			score1 = keyboard.nextInt();
			
			System.out.println("Enter score 2: ");
			score2 = keyboard.nextInt();
			
			System.out.println("Enter score 3: ");
			score3 = keyboard.nextInt();
			keyboard.nextLine();	//consumes nextLine character
			
			//calculate average
			average = (score1 + score2 + score3)/ 3.0;
			System.out.println("Average score is: " + average);
			
			//prompt for repeat
			System.out.println("Do you want to continue? (Y/N)");
			repeat = keyboard.nextLine().toUpperCase().charAt(0);
			
		}while (repeat == 'Y');
	}//end main()
}//end TestAverage1