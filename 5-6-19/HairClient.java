/**
Wendy's hair salon
Application program
File 3 for hair salon

Date 5/6/19
@author Jeffrey Wan
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HairClient extends JFrame
{
	//some fields i dunno man
	private WelcomePanel greeting;
	private ServicePanel routine;
	private OSPanel optional;
	private JButton calcButton;
	private JButton exitButton;
	private JPanel buttonPanel;
	
	//constructor
	public HairClient()
	{
		setTitle("Wendy's Hair Salon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		greeting = new WelcomePanel();
		routine = new ServicePanel();
		optional = new OSPanel();
		
		buildButtonPanel();
		
		//positioning buttons
		add(greeting, BorderLayout.NORTH);
		add(routine, BorderLayout.EAST);
		add(optional, BorderLayout.WEST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();	//no idea what this is dude the teacher said it herself
		setVisible(true);
	}//end constructor
	
	//build the button panel
	public void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		calcButton = new JButton("Total Amount: ");
		exitButton = new JButton("Exit");
		
		//adding stuff to our panel
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
		
		//add action event to buttons
		calcButton.addActionListener(new CalcBtn());
		exitButton.addActionListener(new ExitBtn());
	}
	
	private class CalcBtn implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//calculating total cost
			double cost = 0;
			cost += routine.getCost();
			cost += optional.getCost();
			double tax = cost * 0.06;
			double total = cost + tax;
			
			//display
			JOptionPane.showMessageDialog(null, String.format("Subtotal: $%,.2f\nTax: $%,.2f\nTotal: $%,.2f", cost, tax, total));
			
			
		}	
	}
	
	private class ExitBtn implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}	
	}
	
	
	public static void main(String[] ergs)
	{
		new HairClient();
	}


}

