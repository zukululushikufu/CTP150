/**
Lab 10
Invalid Month Exception class
Instance of this class is thrown when:
*  Value for a month is not between 1 and 12
*  The value for a month name is not January, Feb, ..., December

@author Jeffrey Wan
*/

public class InvalidMonthException extends Exception
{
   //invalid month number
   public InvalidMonthException(int monthNum)
   {
      super("Error: " + monthNum + " falls short of 1 or exceeds 12");
   }
   
   //invalid month name
   public InvalidMonthException(String monthName)
   {
      super("Error: Invalid month name" + monthName + 
            "\nAcceptable month names: " +
            "\nJanuary" +
            "\nFebruary" +
            "\nMarch" +
            "\nApril" +
            "\nMay" +
            "\nJune" +
            "\nJuly" +
            "\nAugust" +
            "\nSeptember" +
            "\nOctober" + 
            "\nNovember" + 
            "\nDecember");
   }

}
