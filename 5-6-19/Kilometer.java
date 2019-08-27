/**
GUI app 1 - converts kilometers to miles
	
*	User enters distance in kilometers
*	Converts to miles
* 	Display
	
Date: 5/6/19
@author Jeffrey Wan
*/

import javax.swing.*;
import java.awt.event.*;

public class Kilometer extends JFrame
{
	//variables
	private JPanel panel;					//window
	private JLabel messageLabel;			//label
	private JTextField kiloTextField;	//text field where we can type stuff
	
	private JButton calcButton;
	private final int WINDOW_WIDTH  = 310;
	private final int WINDOW_HEIGHT = 100;
	
	//constructor
	public Kilometer()
	{
		super("Kilometer Converter");				//window title
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);	//set window size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//closes window if we exit. specifies what happens when closed
		buildPanel();		//builds the panel and adds it to the frame
		add(panel);			//add panel to frames content pane
		setVisible(true);	//displays window
	
	}
	
	//buildPanel adds a label, text field and button to the panel
	private void buildPanel()
	{
		messageLabel = new JLabel("Enter a distance(km) : ");	//creates a label for instructions
		kiloTextField = new JTextField(10);		//we can put 10 numbers in here
		calcButton = new JButton("Calculate");	//a button that says calculate
		
		//add an action listenert to the button
		calcButton.addActionListener(new CalcButtonListener());
		
		//create JPanel object and the first panel field to reference it
		panel = new JPanel();
		panel.add(messageLabel);	//add message label to panel
		panel.add(kiloTextField);	//add text field to panel
		panel.add(calcButton);		//add button to panel
	
	}
	
	//CalcButtonListener class for action listening
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)	//performs an action
		{
			//variables
			final double CONVERSION = 0.6214;	//kilometers to miles
			String input = "";
			double miles = 0;
			
			input = kiloTextField.getText();
			miles = Double.parseDouble(input) * CONVERSION;
			
			JOptionPane.showMessageDialog(null, input + " km is " + String.format("%,.2f", miles) + " miles");
		}
	
	}
	
	//main method
	public static void main(String[] args)
	{
		new Kilometer();	//opens a window when the program runs
	}

}