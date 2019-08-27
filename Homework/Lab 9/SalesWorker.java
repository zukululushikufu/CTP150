/**
SalesWorker subClass
Lab 9

@author Jeffrey Wan
*/

public class SalesWorker extends Worker {
   
   //private attributes for SalesWorker
   private double salesAmount;   

   /**
   No-arg constructor
   */
   public SalesWorker() 
   {
      super();
      salesAmount = 0;
   }
   
   /**
   Overloaded constructor for SalesWorker subclass
   name Parameter used to call super class overloaded constructor
   
   @param name Worker's name
   @param salesAmount The total amount earned from sales
   */
   public SalesWorker(String name, double salesAmount) 
   {
      super(name);
      this.salesAmount = salesAmount;
   }   
   
   /**
   Public method that returns the value stored in private field salesAmount
   
   @return The amount of money earned from sales
   */
   public double getSalesAmount() 
   {
      return salesAmount;
   }

   /**
   Public method that changes the value of private 
   */
   public void setSalesAmount(double salesAmount) 
   {
      this.salesAmount = salesAmount;
   }
   
   /**
   Overrides superClass getPay() method to calculate money earned from sales
   
   @return 10% of total money earned from sales
   */
   @Override
   public double getPay() {
      return salesAmount * 0.1;
   }

   /**
   Checks if the compared object is the same as current object by comparing
   their fields
   
   @param test A SalesWorker object that you wish to test for equality
   @return True if all fields are equal, false if any differ
   */   
   public boolean equals(SalesWorker test) {
      return (getName().equals(test.getName()) && this.salesAmount == test.salesAmount) ? true : false;
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
      str += ("\nSales Amount: $" + String.format("%,.2f", salesAmount));
      
      return str;
   }

}