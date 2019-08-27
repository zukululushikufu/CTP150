/**
Truck class
Lab 4
@author Jeffrey Wan
*/

public class Truck 
{
   //private attributes
   private String make;
   private String model;
   private int mileage;
   
   //constants
   private final int OIL_CHANGE_INTERVAL = 4000; 
   private final int TIRE_ROTATION_INTERVAL = 6000;
   
   //constructors  
   public Truck() 
   {
      make = "";
      model = "";
      mileage = 0;
   }
   
   public Truck(String make, String model, int mileage) 
   {
      this.make = make;
      this.model = model;
      this.mileage = mileage;
   }
   
   //getters
   public String getMake() 
   {
      return make;
   }
   
   public String getModel() 
   {
      return model;
   }
   
   public int getMileage() 
   {
      return mileage;
   }
   
   public int getOilChangeInterval()
   {
      return OIL_CHANGE_INTERVAL;
   }
   
   public int getTireRotationInterval()
   {
      return TIRE_ROTATION_INTERVAL;
   }
   
   //setters
   public void setMake(String make) 
   {
      this.make = make;
   }
   
   public void setModel(String model) 
   {
      this.model = model;
   }
   
   public void setMileage(int mileage) 
   {
      this.mileage = mileage;
   }
   
   /**
   Gets the next 4 oil changes based on the user's mileage
   
   @param mileage The current mileage on the vehicle
   @return The next 4 mileages to get oil changes at, in a String format 
   */
   public String getNext4OilChanges(int mileage) 
   {
      //accumulator for next 4 oil changes
      String nextOilMileage = "";
      final int NUM_OIL_CHANGES = 4;
      
      //increment mileage, convert, concatenate
      for(int i = 0; i < NUM_OIL_CHANGES; i++)
      {
         mileage += OIL_CHANGE_INTERVAL;
         nextOilMileage += Integer.toString(mileage);
         
         //adds a comma unless last entry
         if (i < (NUM_OIL_CHANGES - 1))
            nextOilMileage += ", ";
      }
      return nextOilMileage;
   }
   
   /**
   Gets the next 3 tire rotations based on the current mileage
   
   @param mileage The current mileage on the vehicle
   @return The next 3 mileages to change the tires at, in a String format
   */
   public String getNext3TireRotations(int mileage)
   {
      //accumulator for next 3 Tire rotations
      String nextTireMileage = "";
      final int NUM_TIRE_CHANGES = 3;
      
      //increment mileage, convert, concatenate
      for(int i = 0; i < NUM_TIRE_CHANGES; i++)
      {
         mileage += TIRE_ROTATION_INTERVAL;
         nextTireMileage += Integer.toString(mileage);
         
         //adds comma unless last entry
         if (i < (NUM_TIRE_CHANGES - 1))
         {
            nextTireMileage += ", ";
         }
      }
      return nextTireMileage;
   }
   
   public String toString() 
   {
      String str = "";
      
      str += ("Make: " + make + "\n");
      str += ("Model: " + model + "\n");
      str += ("Mileage: " + mileage + "\n");
      str += ("Next 4 oil changes (miles): " + getNext4OilChanges(mileage) + "\n");
      str += ("Next 3 tire changes (miles): " + getNext3TireRotations(mileage) + "\n");
      
      return str;
   }
   
}
