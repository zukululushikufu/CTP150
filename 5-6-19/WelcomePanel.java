/**
Wendy's hair salon
Calculates total cost for all selected items
File 1 for hair salone

Date 5/6/19
@author Jeffrey Wan
*/

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel
{
	//attribute
	private JLabel greeting;
	
	//constructor
	public WelcomePanel()
	{
		greeting = new JLabel("Welcome to Wendy's Hair Salon amigo!");
		add(greeting);	//adds label to panel
	}
}