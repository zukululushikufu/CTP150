/**
Wendy's hair salon
Calculates total cost for all selected items
File 3 for hair salon
Select services using radial buttons

Date 5/6/19
@author Jeffrey Wan
*/

import javax.swing.*;
import java.awt.*;

public class OSPanel extends JPanel
{
	//some radial buttons and text fields
	private int price;
	private JRadioButton yes;
	private JRadioButton no;
	private ButtonGroup bg;
	private JTextField timesField;
	private JLabel timesLabel;
	
	public OSPanel()
	{
		//initialize buttons
		yes = new JRadioButton("Waxing");	//set radial button 1
		no = new JRadioButton("No Other Services (Vagrant EDITION)");
		timesLabel = new JLabel("Number of times waxed: ");
		timesField = new JTextField(10);		//text field where they enter a number
		
		//add radial buttons to panel
		add(yes);
		add(no);
		add(timesLabel);
		add(timesField);
		
		//button group stuff
		bg = new ButtonGroup();
		bg.add(yes);
		bg.add(no);
		
		setBorder(BorderFactory.createTitledBorder("Other Service"));
		setLayout(new GridLayout(2, 1));
	}
	
	public double getCost()
	{
		double cost = 0;
		String timesString = timesField.getText();	//gets input from timesField text field
		
		//calculate costs
		if(yes.isSelected())
		{
			double times = Double.parseDouble(timesString);
			cost = times * 5;
		}
		else if(no.isSelected())
		{
			cost = 0;
		}
		
		return cost;
	}


}