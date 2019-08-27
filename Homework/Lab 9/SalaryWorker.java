/**
SalaryWorker subclass
Lab 9

@author Jeffrey Wan
*/

public class SalaryWorker extends Worker {

   //private attributes SalaryWorker
   private double yearlyPay;
   
   /**
   No-arg constructor for SalaryWorker
   */
   public SalaryWorker() 
   {
      super();
      yearlyPay = 0;
   }
   
   /**
   Overloaded constructor for SalaryWorker
   Name parameter is used to call Worker's overloaded constructor
   
   @param name Worker's name
   @param yearlyPay The yearly salary for the worker
   */
   public SalaryWorker(String name, double yearlyPay) 
   {
      super(name);
      this.yearlyPay = yearlyPay;
   }
   
   /**
   Public method that returns the private field yearlyPay
   
   @return The value stored in yearlyPay
   */
   public double getYearlyPay() 
   {
      return yearlyPay;
   }
   
   /**
   Public method that changes the value for the private field yearlyPay
   
   @param yearlyPay The new value to be stored in yearlyPay
   */
   public void setYearlyPay(double yearlyPay) 
   {
      this.yearlyPay = yearlyPay; 
   }
   
   /**
   Overrides abstract getPay() method inherited from Worker super class
   */
   
   @Override
   public double getPay() 
   {
      return yearlyPay / 52.0;
   }
   
   /**
   Checks if the compared object is the same as current object by comparing
   their fields
   
   @param test A SalaryWorker object that you wish to test for equality
   @return True if all fields are equal, false if any differ
   */
   public boolean equals(SalaryWorker test) 
   {   
      boolean same = false;
      
      //test equality
      if (  this.getName().equals(test.getName()) && 
            this.yearlyPay == test.yearlyPay)
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
      str += ("\nYearly Pay: $" + String.format("%,.2f", yearlyPay));
      
      return str;
   }

}