/**
Brochure class
Lab 7

@author Jeffrey Wan
*/
import java.util.ArrayList;

public class Brochure {
   
   //private attributes
   private ArrayList<BrochureItem> brochureList;
   public static int count = 0;
  
   /**
   No argument constructor for Brochure class
   */
   public Brochure() 
   {
      brochureList = new ArrayList<BrochureItem>();
      count++;   
   }
   
   /**
   Displays the number of BrochureItems instantiated followed by information on all BrochureItems in the ArrayList
   */
   public void display() 
   {
      System.out.println("\nThe Brochure consists of " + BrochureItem.count + " items.");
      for (int index = 0; index < brochureList.size(); index++)
      {
         System.out.println(brochureList.get(index));
      }
      
      /*can also use enhanced for loop
      *  for(BrochureItem item : brochureList)
      *     System.out.println(item);
      */
      System.out.println();
   }
   
   /**
   Adds a BrochureItem object to the ArrayList brochureList
   */
   public void add(BrochureItem item) 
   {
      BrochureItem copy = new BrochureItem(item);
      brochureList.add(copy);
      
      /* can also add like so:
      *  brochureList.add(new BrochureItem(item));
      */
   }
   
   /**
   Instantiates a new BrochureItem object using the overloaded constructor, then adds it to brochureList
   
   @param itemId The ID number of the item
   @param description A description of the item
   @param price The price of the item
   */
   public void add(int itemId, String description, double price) 
   {
      brochureList.add(new BrochureItem(itemId, description, price));
   }
   
   /**
   Iterates through the ArrayList brochureList to find the object containing the correct itemId
   
   @param itemId The ID number of the item
   @return The index if itemId is found, otherwise it returns -1
   */
   public int searchArrayList(int itemId)
   {
      for(int index = 0; index < brochureList.size(); index++)
      {
         if(brochureList.get(index).getItemId() == itemId)
            return index;
      }
      
      return -1;
   }
   
   /**
   Updates the description for an item for a particular itemId
   
   @param itemId The ID number of the item
   @param description The description for the item
   */
   public void update(int itemId, String description) 
   {
      //assign index from search
      int itemIndex = searchArrayList(itemId);
      
      //change value
      brochureList.get(itemIndex).setDescription(description);
   }
   
   /**
   Updates the price for an item for a particular itemId
   
   @param itemId The ID number of the item
   @param price The price of the item
   */
   public void update(int itemId, double price) 
   {
      //assign index from search
      int itemIndex = searchArrayList(itemId);
      
      //change value
      brochureList.get(itemIndex).setPrice(price);
   }
   
   /**
   Increases and changes the price for all BrochureItems in brochureList by the percentage passed in
   
   @param percentage A percentage increase represented like so: 10% -> 0.10
   */
   public void priceIncrease(double percentage) 
   {
      double increase = 0;
      
      for(int index = 0; index < brochureList.size(); index++)
      {
         increase = brochureList.get(index).getPrice() * (1 + percentage);
         brochureList.get(index).setPrice(increase);
      }  
   }
   
   /**
   Finds a particular BrochureItem based on the itemId the user is searching for
   
   @return If the index is -1 return null, otherwise return the BrochureItem with the correct itemId
   */
   public BrochureItem getBrochureItem(int itemId) 
   {
      //if index returned = -1, return null, else return BrochureItem at index
      return searchArrayList(itemId) == -1 ? null : brochureList.get(searchArrayList(itemId));
   }
   
   /**
   Automatically called when using the name of the reference variable. Will no longer display memory address location.
   
   @return The String representation for all BrochureItems in brochureList
   */
   public String toString() 
   {
      String str = "";
      str += ("\nThe Brochure consists of " + BrochureItem.count + " items.");      
      for(int index = 0; index < brochureList.size(); index++)
      {
         str += ("\n" + brochureList.get(index).toString());
      }
      
      return str;
   }

}
