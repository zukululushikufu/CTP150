/**
Joe's Auto Service window
Lab 11

@author Jeffrey Wan
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JoesAutoService extends JFrame
{
   //declare some componenets
   private WelcomePanel welcome;
   private RoutineServices routine;
   private OtherServices others;
   private JButton calculate;
   private JButton exit;
   private JPanel buttonPanel;
   
   //constructor
   public JoesAutoService()
   {
      //set window
      setTitle("Joe's Auto Services");
      setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //set other components
      welcome = new WelcomePanel();
      routine = new RoutineServices();
      others = new OtherServices();
      buildButtonPanel();  //build panel for calculate and exit
      
      //add panels
      add(welcome, BorderLayout.NORTH);
      add(routine, BorderLayout.WEST);
      add(others, BorderLayout.EAST);
      add(buttonPanel, BorderLayout.SOUTH);
      
      //set visibility of window
      pack();
      setVisible(true);
   }
   
   public void buildButtonPanel()
   {
      //initializing buttons
      buttonPanel = new JPanel();
      calculate = new JButton("Calculate");
      exit = new JButton("Exit");
      
      //adding buttons to button panel
      buttonPanel.add(calculate);
      buttonPanel.add(exit);
      
      //add action events to buttons
      calculate.addActionListener(new CalcBtn());
      exit.addActionListener(new ExitBtn());
   }
   
   //calculate button object
   private class CalcBtn implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //calculate total cost
         double cost = 0;
         cost += routine.getCost();
         cost += others.getCost();
         
         //calculate tax
         double tax = cost * 0.06;
         
         //calculate total
         double total = cost + tax;
         
         //display results in a window
         JOptionPane.showMessageDialog(null, String.format("Subtotal: $%,.2f\nTax: $%,.2f\nTotal: $%,.2f", cost, tax, total));
      }
   }//end calculate button
   
   private class ExitBtn implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }//end exit button
   
   //show window
   public static void main(String[] ergs)
   {
      new JoesAutoService();
   }

}
