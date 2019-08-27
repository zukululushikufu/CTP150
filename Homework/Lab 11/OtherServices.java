/**
Other Services panel
Lab 11

@author Jeffrey Wan
*/

import java.awt.*;
import javax.swing.*;

public class OtherServices extends JPanel
{
   //declare radiobuttons and text field
   private JRadioButton no;
   private JRadioButton yes;
   private JTextField textField;
   private JLabel numHours;
   
   //constructor
   public OtherServices()
   {
      //set appropriate labels
      no = new JRadioButton("No Other Services");
      yes = new JRadioButton("Other Services");
      numHours = new JLabel("Number of hours: ");
      textField = new JTextField(10);
      
      //button group to prevent multiple selections
      ButtonGroup bg = new ButtonGroup();
      bg.add(no);
      bg.add(yes);
      
      //add buttons to panel
      add(no);
      add(yes);
      add(numHours);
      add(textField);
      
      //set borders
      setBorder(BorderFactory.createTitledBorder("Other Serivces"));
      setLayout(new GridLayout(4, 1));
   }
   
   public double getCost()
   {
      //accumulator
      double cost = 0;
      String numHours = textField.getText();
      
      //set costs appropriately
      if(yes.isSelected())
      {
         try
         {
            double hours = Double.parseDouble(numHours);
            cost = hours * 20.0;
         }
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null, "Error: Other Services selected but no hours entered. Closing program. . .");
            System.exit(0);
         }
      }
      else if(no.isSelected())
      {
         cost = 0;
      }
      
      return cost;
   }

}