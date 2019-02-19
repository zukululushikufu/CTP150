/**
This program will calculate number of soccer teams
created from a list of available players using a while loop
File 3
@author Jeffrey Wan
@date 2/11/19
*/
import javax.swing.JOptionPane;

public class SoccerTeams
{
	public static void main(String[] args)
	{
		//constants
		final int MIN_PLAYERS = 9;
		final int MAX_PLAYERS = 15;
		
		//variables
		int players = 0;
		int teamSize = 0;
		int teams = 0;
		int leftOver = 0;
		String input = "";
		
		//get the number of players per team
		input = JOptionPane.showInputDialog("Enter the number of players per team: ");
		teamSize = Integer.parseInt(input);
		
		//checks for valid team size
		while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
		{
			input = JOptionPane.showInputDialog("You've entered an invalid number."
							+ " Minimum players per team = " + MIN_PLAYERS + ", Maximum players per team = " + MAX_PLAYERS);
			teamSize = Integer.parseInt(input);
		}
		
		//get available players
		input = JOptionPane.showInputDialog("Enter the available number of players: ");
		players = Integer.parseInt(input);
		
		//check for valid players number
		while (players < 0)
		{
			input = JOptionPane.showInputDialog("Enter 0 or greater");
			players = Integer.parseInt(input);
		}
		
		//calculate number of teams
		teams = players/teamSize;
		
		//calculate leftover players
		leftOver = players % teamSize;
		
		//display results
		JOptionPane.showMessageDialog(null, "There will be " + teams + " teams with " + leftOver + " players left over.");

		System.exit(0)
	}//end main()
}//end SoccerTeams