/**
Company class
Lab 6

@author Jeffrey Wan
*/

public class Company 
{
   
   //private attributes
   private String symbol;
   private String name;
   private double previousPrice;
   private double currentPrice;

  
   //constructor
   /**
   Constructor for the Company class that initializes symbol, name,
   previousPrice, and currentPrice to blank strings and zeroes
   */
   public Company() 
   {
      symbol = "";
      name = "";
      previousPrice = 0.0;
      currentPrice = 0.0;
   }
   
   /**
   Overloaded constructor for the Company class that initializes symbol and name
   to the arguments passed into it, and previousPrice and currentPrice to 0.
   
   @param symbol A company's stock symbol
   @param name A Company's name
   */
   public Company(String symbol, String name) 
   {
      this.symbol = symbol;
      this.name = name;
      previousPrice = 0.0;
      currentPrice = 0.0;
   }
   
   //getters
   /**
   getSymbol() returns the String stored in the private symbol attribute
   
   @return The contents of symbol as a String
   */
   public String getSymbol() 
   {
      return symbol;
   }

   /**
   getName() returns the String stored in the private name attribute
   
   @return The contents of name as a String
   */
   public String getName() 
   {
      return name;
   }

   /**
   getPreviousPrice() returns the value stored in the private previousPrice attribute
   
   @return The value stored in previousPrice
   */
   public double getPreviousPrice() 
   {
      return previousPrice;
   }

   /**
   getCurrentPrice() returns the value stored in the private currentPrice attribute
      
   @return The contents of symbol as a String
   */
   public double getCurrentPrice() 
   {
      return currentPrice;
   }
   
   //setter
   /**
   setName() changes the contents of the private attribute name with the String
   argument passed into this method
   
   @param name A company name
   */
   public void setName(String name) 
   {
      this.name = name;
   }

   /**
   setSymbol() changes the contents of the private attribute symbol with the String
   argument passed into this method
   
   @param symbol A company's stock symbol
   */
   public void setSymbol(String symbol) 
   {
      this.symbol = symbol;
   }

   /**
   setPreviousPrice() changes the contents of the private attribute previousPrice
   with the double argument passed into this method
   
   @param name The stock price for a company one month ago
   */
   public void setPreviousPrice(double previousPrice) 
   {
      this.previousPrice = previousPrice; 
   }

   /**
   setCurrentPrice() changes the contents of the private attribute currentPrice
   with the double argument passed into this method
   
   @param name The current stock price for a company
   */
   public void setCurrentPrice(double currentPrice) 
   {
      this.currentPrice = currentPrice;
   }
   
   /**
   The toString() method is automatically called when the reference variable
   of the Company object is passed into any print statement to display the String defined in the body
   
   @return A formatted display of the company data
   */
   public String toString() 
   {
      String str = "\n";
      
      str += ("Symbol: " + symbol);
      str += ("\nName: " + name);
      str += ("\nPrevious price: " + previousPrice);
      str += ("\nCurrent price: " + currentPrice);
      
      return str;
   }

}
