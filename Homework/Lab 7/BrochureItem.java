/**
BrochureItem Class
Lab 7

@author Jeffrey Wan
*/
public class BrochureItem {
   
   //private attributes
   private int itemId;
   private String description;
   private double price;
   public static int count = 0;
   

   /**
   No argument constructor for BrochureItem()
   */
   public BrochureItem() 
   {
      this.itemId = 0;
      this.description = "";
      this.price = 0;
      
      count++;
   }
   
   /**
   Overloaded constructor for BrochureItem()
   
   @param itemId The ID number of the item
   @param description A description of the item
   @param price The price of the item
   */
   public BrochureItem(int itemId, String description, double price) 
   {
      this.itemId = itemId;
      this.description = description;
      this.price = price;
      
      count++;
   }
   
   /**
   A constructor that copies the attributes of another object 
   
   @param copy A BrochureItem reference variable
   */
   public BrochureItem(BrochureItem copy) 
   {
      this.itemId = copy.itemId;
      this.description = copy.description;
      this.price = copy.price;
   }
   
   /**
   ItemId accessor
   
   @return The ID for the item
   */
   public int getItemId() 
   {
      return itemId;
   }
   
   /**
   Description accessor
   
   @return The description for the item
   */
   public String getDescription() 
   {
      return description;
   }
   
   /**
   Price accessor
   
   @return The price of the item
   */
   public double getPrice() 
   {
      return price;
   }
   
   /**
   Changes the value of the description
   
   @param description The item's new description
   */
   public void setDescription(String description) 
   {
      this.description = description;
   }
   
   /**
   Changes the price of the item
   
   @param price The new price for the item
   */
   public void setPrice(double price) 
   {
      this.price = price;
   }
   
   /**
   Automatically called when the name of the reference variable is called
   
   @return A String representation of the state of the object
   */
   public String toString() 
   {
      String str = "";
      
      str += ("Item: " + itemId);
      str += (", " + description);
      str += (", Price: $" + String.format("%.2f",price));
      
      return str; 
   }
   
   /**
   Compares the attributes of 2 objects for equality
   
   @param test A BrochureItem to compare to
   @return True if all attributes are equal, false if even one attribute is different
   */
   public boolean equals(BrochureItem test) 
   {
      if(test.itemId == itemId && test.description.equalsIgnoreCase(description) && test.price == price)
         return true;
      else
         return false;
   }

}