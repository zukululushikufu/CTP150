/**
Welcome to Joe's Auto Service panel
Lab 11

@author Jeffrey Wan
*/

import java.awt.*;
import javax.swing.*;

public class WelcomePanel extends JPanel
{
   //declaring JLabel variable
   private JLabel welcome;
   
   //constructor
   public WelcomePanel()
   {
      welcome = new JLabel("Welcome to Joe's Auto Service");
      add(welcome);  //adds label to panel
   }


}