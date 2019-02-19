/**
This program will demonstrate an if statement
File 4
@author: Jeffrey Wan
@date: 2/4/19
*/

import javax.swing.JOptionPane;

public class TestResultsMenu
{
	public static void main(String[] args)
	{
		//variables
		int option = 0;
		String input = "";
		
		//inputs
		input = JOptionPane.showInputDialog("Enter 1.) grade by number: \nEnter 2.) grade by letter: ");
		option = Integer.parseInt(input);
		
		if (option == 1)
			gradeByNumber();
		else
		if (option == 2)
			gradeByLetter();
		else
		{	
			JOptionPane.showMessageDialog(null, "Invalid option number.Enter 1 or 2");
			System.exit(0);
		}
	}//end main()
	
	public static void gradeByNumber()
	{
		double testScore = 0;
		String input = "";
		
		input = JOptionPane.showInputDialog("Enter your test score: ");
		testScore = Double.parseDouble(input);

		//multiple selection
		if (testScore < 60)
			JOptionPane.showMessageDialog(null, "Your grade is an F");	//null in showMessageDialog means that the message box is centered on the screen
			if (testScore < 50)
			{
				JOptionPane.showMessageDialog(null, "Please show up to class.");
				JOptionPane.showMessageDialog(null, "Office hours are before and after class.");
			}
			
		else 
		if (testScore < 70)
			JOptionPane.showMessageDialog(null, "Your grade is an D");
			
		else 
		if (testScore < 80)
			JOptionPane.showMessageDialog(null, "Your grade is an C");
			
		else 
		if (testScore < 90)
			JOptionPane.showMessageDialog(null, "Your grade is an B");
			
		else
			JOptionPane.showMessageDialog(null, "Your grade is an A");
	}//end gradeByNumber()
	
	public static void gradeByLetter()
	{
		String letter = "";
		String input = "";
		
		letter = JOptionPane.showInputDialog("Enter grade letter: ");

		//multiple selection
		if (letter.equalsIgnoreCase("F"))
			{
				JOptionPane.showMessageDialog(null, "Your grade is< 60%");	//null in showMessageDialog means that the message box is centered on the screen
				JOptionPane.showMessageDialog(null, "Please show up to class.");
				JOptionPane.showMessageDialog(null, "Office hours are before and after class.");
			}
			
		else 
		if (letter.equalsIgnoreCase("D"))
			JOptionPane.showMessageDialog(null, "Your grade is < 70%");
			
		else 
		if (letter.equalsIgnoreCase("C"))
			JOptionPane.showMessageDialog(null, "Your grade is < 80%");
			
		else 
		if (letter.equalsIgnoreCase("B"))
			JOptionPane.showMessageDialog(null, "Your grade is < 90%");
			
		else
		if (letter.equalsIgnoreCase("A"))
			JOptionPane.showMessageDialog(null, "Your grade is < 100%");
	}//end gradeByLetter()
}//end TestResults