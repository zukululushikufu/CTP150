/**
TruckMaintenanceDriver class
Runs the program
@author Jeffrey Wan
*/

public class TruckMaintenanceDriver 
{
   public static void main(String[] args) 
   {
      //instantiations
      Truck ford = new Truck("Ford", "F-150", 54000);
      Truck gmc = new Truck("GMC", "Canyon", 25000);
      Truck toyota = new Truck("Toyota", "Tundra", 10000);
      
      //printing out object's details
      System.out.println(ford + "\n");
      System.out.println(gmc + "\n");
      System.out.println(toyota + "\n");
   }

}