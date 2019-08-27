/**
Wendy's hair salon
Calculates total cost for all selected items
File 2 for hair salon
Select services using checkboxes

Date 5/6/19
@author Jeffrey Wan
*/

import javax.swing.*;
import java.awt.*;

public class ServicePanel extends JPanel
{
	//attributes
	private JCheckBox[] services;
	private final String[] LABELS = {"Hair Cut", "Hair Dye", "Blow Dry"};
	private final int[] PRICES = {25, 50, 5};
	private final int ITEM_COUNT = 3;
	
	//constuctor
	public ServicePanel()
	{
		services = new JCheckBox[ITEM_COUNT];
		
		//adds services check boxes to panel
		for(int index = 0; index < ITEM_COUNT; index ++)
		{
			services[index] = new JCheckBox(LABELS[index]);
			add(services[index]);
		}
		
		setBorder(BorderFactory.createTitledBorder("Services: "));
		setLayout(new GridLayout(ITEM_COUNT, 1));
	
	}
	
	/**
	getter for costs of services
	
	@return cost of services
	*/
	public double getCost()
	{
		double cost = 0;
		
		//calculate cost
		for(int index = 0; index < ITEM_COUNT; index++)
		{
			if(services[index].isSelected())
			{
				cost += PRICES[index];
			}
		}
		
		return cost;
	}


}