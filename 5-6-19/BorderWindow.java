/**
This demos border layout

Date: 5/6/19
@author Jeffrey Wan
*/

import javax.swing.*;
import java.awt.*;

public class BorderWindow extends JFrame
{
	//window settings
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 300;
	
	//constructor
	public BorderWindow()
	{
		super("Border Layout");	//window header
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);	//set window size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//buttons
		JButton button1 = new JButton("North Button");
		JButton button2 = new JButton("South Button");
		JButton button3 = new JButton("East Button");
		JButton button4 = new JButton("West Button");
		JButton button5 = new JButton("Center Button");
		
		//add buttons to the content pane
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.EAST);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
		
		//show window
		setVisible(true);
	}
	
	//main method to run window
	public static void main(String[] args)
	{
		new BorderWindow();
	
	}

}
