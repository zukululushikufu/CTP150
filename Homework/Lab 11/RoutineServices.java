/**
Routine Services panel
Lab 11

@author Jeffrey Wan
*/

import java.awt.*;
import javax.swing.*;

public class RoutineServices extends JPanel
{
   //constants and JCheckBoxes
   private JCheckBox[] services;
   private final int ITEM_COUNT = 7;
   private final String[] LABELS = {"Oil Changes",
                                    "Lube Job",
                                    "Radiator Flush",
                                    "Transmission Flush",
                                    "Inspection",
                                    "Muffler Replacement",
                                    "Tire Rotation"};
   private final double[] PRICES = {26, 18, 30, 80, 15, 100, 20};
   
   //constructor
   public RoutineServices()
   {
      //initialize services array
      services = new JCheckBox[ITEM_COUNT];
      
      //fill up services checkbox names
      for(int index = 0; index < ITEM_COUNT; index++)
      {
         services[index] = new JCheckBox(LABELS[index]);
         add(services[index]);   //add service checkbox to panel
      }
      
      //set borders
      setBorder(BorderFactory.createTitledBorder("Routine Services"));
      setLayout(new GridLayout(ITEM_COUNT, 1));
   }//end constructor
   
   public double getCost()
   {
      //accumulator
      double totalCost = 0;
      
      for(int index = 0; index < ITEM_COUNT; index++)
      {
         if(services[index].isSelected())
         {
            totalCost += PRICES[index]; 
         }
      }
      
      return totalCost;
   }
   

}