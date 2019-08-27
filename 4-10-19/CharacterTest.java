/**
This program will demo Character class
File 1

Date: 4/10/19
@author Jeffrey Wan
*/
import javax.swing.JOptionPane;

public class CharacterTest
{
	public static void main(String[] args)
	{
		//variables
		String input = "";
		char ch = ' ';
		boolean cont = false;
		
		while(!cont)
		{
			input = JOptionPane.showInputDialog(null, "Enter any single character");
			
			ch = input.charAt(0);
			
			if(Character.isLetter(ch))
			{
				JOptionPane.showMessageDialog(null, " That is a letter");
			}
			if(Character.isDigit(ch))
			{
				JOptionPane.showMessageDialog(null, " That is a digit");
			}
			if(Character.isLowerCase(ch))
			{
				JOptionPane.showMessageDialog(null, " That is a lower case letter");
			}
			if(Character.isUpperCase(ch))
			{
				JOptionPane.showMessageDialog(null, " That is an upper case letter");
			}
			if(Character.isSpaceChar(ch))
			{
				JOptionPane.showMessageDialog(null, " That is a space");
			}
			if(Character.isWhitespace(ch))
			{
				JOptionPane.showMessageDialog(null, " That is a whiteSpace letter");
			}

			input = JOptionPane.showInputDialog("Do you want to enter another character? (Y/N)");
			
				if(input.equalsIgnoreCase("y"))
					cont = false;
				else
					cont = true;
		}//end while()
		
		//must be used when using JOptionPane
		System.exit(0);
	}//end main()
}
