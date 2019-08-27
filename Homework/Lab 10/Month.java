/**
Lab 10 - Month Class

@author Jeffrey Wan
*/

public class Month
{
   //attributes
   int monthNumber;
   
   //no-arg constructor
   public Month()
   {
      this.monthNumber = 1;
   }
   
   //overloaded constructor with month number
   public Month(int monthNum) throws InvalidMonthException
   {
      //if month number is less than 1 or greater than 12 throw exception
      if (monthNum < 1 || monthNum > 12)
         throw new InvalidMonthException(monthNum);
      else
         this.monthNumber = monthNum;
   }
   
   //overloaded with monthName
   public Month(String monthName) throws InvalidMonthException
   {
      //if month name does not match list of acceptable months throw exception
      if(!( monthName.equalsIgnoreCase("January") ||
            monthName.equalsIgnoreCase("February") ||
            monthName.equalsIgnoreCase("March") ||
            monthName.equalsIgnoreCase("April") ||
            monthName.equalsIgnoreCase("May") ||
            monthName.equalsIgnoreCase("June") ||
            monthName.equalsIgnoreCase("July") ||
            monthName.equalsIgnoreCase("August") ||
            monthName.equalsIgnoreCase("September") ||
            monthName.equalsIgnoreCase("October") ||
            monthName.equalsIgnoreCase("November") ||
            monthName.equalsIgnoreCase("December")))
      {
         throw new InvalidMonthException(monthName);
      }
   }
   
   //getter
   public int getMonthNum()
   {
      return monthNumber;
   }
   
   //setter validates the month number
   public void setMonthNum(int monthNum) throws InvalidMonthException
   {
      if(monthNum < 1 || monthNum > 12)
         throw new InvalidMonthException(monthNum);
      else
         this.monthNumber = monthNum;
   }
   
   //returns the month name based on the month number
   public String getMonthName()
   {
      switch(monthNumber)
      {
         case 1:
            return "January";
         case 2:
            return "February";
         case 3:
            return "March";
         case 4:
            return "April";
         case 5:
            return "May";
         case 6:
            return "June";
         case 7:
            return "July";
         case 8:
            return "August";
         case 9:
            return "September";
         case 10:
            return "October";
         case 11:
            return "November";
         case 12:
            return "December";
         default:
            return null;
            
      } 
   }
   
   public String toString()
   {
      return this.getMonthName();
   }
   
   //compares the equality between 2 month objects
   public boolean equals(Month test)
   {
      if(this.monthNumber == test.monthNumber)
         return true;
      else
         return false;
   }


}