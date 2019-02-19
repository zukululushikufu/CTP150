/**
This program will demonstrate an if statement
File 3
@author: Jeffrey Wan
@date: 2/4/19
*/

import javax.swing.JOptionPane;

public class TestResultsNesting
{
	public static void main(String[] args)
	{
		double testScore = 0;
		String input = "";
		
		input = JOptionPane.showInputDialog("Enter the test score: ");
		testScore = Double.parseDouble(input);	//reminder: JOptionPane inputs are always a string so we need to parse it to assign it to score1
		
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
		
		System.exit(0);	//terminates program
	
	}//end main()
}//end TestResults