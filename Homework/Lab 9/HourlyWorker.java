/**
HourlyWorker subclass
Lab 9

@author Jeffrey Wan
*/

public class HourlyWorker extends Worker {

   //private attributes for HourlyWorker
   private double hoursWorked;
   private double payRate;

   /**
   No arg constructor
   */
   public HourlyWorker() 
   {
      super();
      hoursWorked = 0;  //total hours worked per week
      payRate = 0;
   }

   /**
   Overloaded constructor for HourlyWorker
   Name parameter used to call overloaded superclass constructor
   
   
   @param name Worker's name
   @param hoursWorked The number of hours the employee has worked in the past week
   @param payRate Hourly pay rate
   */
   public HourlyWorker(String name, double hoursWorked, double payRate) 
   {
      super(name);
      this.hoursWorked = hoursWorked;
      this.payRate = payRate;
   }

   /**
   Public method that returns the value stored in private field hoursWorked
   
   @return Value stored in hoursWorked field
   */
   public double getHoursWorked() {
      return hoursWorked;
   }
   
   /**
   Public method that returns the value stored in private field payRate
   
   @return Value stored in payRate field
   */
   public double payRate() {
      return payRate;
   }
   
   /**
   Public method that changes the value of private field hoursWorked
   */
   public void setHoursWorked(double hoursWorked) 
   {
      this.hoursWorked = hoursWorked;
   }

   /**
   Public method that changes the value of private field payRate
   */
   public void setPayRate(double payRate) 
   {
      this.payRate = payRate;
   }
   
   /**
   Overrides super class' getPay() method and calculates hourly pay
   
   @return Weekly pay based on worker's hoursWorked, payRate, and
   any eligible overtime pay
   */
   @Override
   public double getPay() 
   {
      double pay = 0;
      
      //calculations
      pay = hoursWorked * payRate;
      
      //additional overtime if eligible
      if (hoursWorked > 40)
      {
         pay += ((hoursWorked - 40) * (1.5 * payRate));
      }   
      
      //if pay is < 0 error checking
      if (pay < 0)
      {
         System.out.println("Error occurred while calculating your weekly pay.");
         System.out.println("Please check if hours worked or pay rate is less than 0");
         
         return 0;
      }
      
      return pay;
   }
   
   /**
   Checks if the compared object is the same as current object by comparing
   their fields
   
   @param test An HourlyWorker object that you wish to test for equality
   @return True if all fields are equal, false if any differ
   */
   public boolean equals(HourlyWorker test) 
   {
      boolean same = false;
      
      if(getName().equals(test.getName()) &&
         this.hoursWorked == test.hoursWorked &&
         this.payRate == test.payRate)
         same = true;
      
      return same;
   }
   
   /**
   Replaces hexadecimal memory address location for object with string representation of
   object's state
   
   @return String representation of object's current state   
   */
   public String toString() 
   {
      String str = "";
      
      str += (super.toString());
      str += ("\nHours Worked: " + hoursWorked);
      str += ("\nPay Rate: $" + String.format("%,.2f/ hour", payRate));
      
      return str;
   }

}
