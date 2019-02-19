/**
This is a Scanner demonstration
File 3
@author: Jeffrey Wan
@date: 1/30/19
*/

import javax.swing.JOptionPane;

public class CreditCardJOption
{
	public static void main(String[] args)
	{
		//variable declarations
		double salary;		//annual salary
		int creditRating;	//credit rating
		String input;		//holds user input
		
		input = JOptionPane.showInputDialog("What is your annual salary?");
		
		//prompts and inputs
		//gets salary
		System.out.println("What is your annual salary?");
		salary = Double.parseDouble(input);	//
		
		//gets credit rating
		System.out.println("On a scale of 1 - 10. what is your credit rating?\n" + "10 = excellent, 1 = bad");
		creditRating = keyboard.nextInt();
		
		//determine if user is qualified
		if (salary >=  20000 && creditRating >= 7)	
			qualify();
		else
			notQualified();
			
		System.exit(0);
	}//end main
	
	public static void qualify()
	{	
		System.out.println("Congratulations, you qualify for the laon.");
	}//end qualify
	
	public static void notQualified()
	{
		System.out.println("Sorry, you are not qualified for the loan.");
	}//end notQualified	
}//end CreditCardScanner

/* Notes
*	JOptionPane makes everything into strings so we need to remember to convert back into numbers afterwards
*/