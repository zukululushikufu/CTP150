 /** Test Client for testing the Brochure class
   * @author Professor Chasser  */
   
 public class Lab7
 {
 public static void main(String[] args)
 {
 // TEST 1
 // Create Brochure and test the static getCount method
    System.out.println("Class has not been created. There are " + Brochure.count + " items.");
    Brochure myBrochure = new Brochure();
    System.out.println("\nBrochure class created. ");
    myBrochure.display();
 
    
 // TEST 2
 // Test the add method (version 1)
    BrochureItem item1 = new BrochureItem(900, "Pencils", 1.25);
    BrochureItem item2 = new BrochureItem(234, "Crayons", 2.50);
    BrochureItem item3 = new BrochureItem(245, "Paper", 5.00);
    myBrochure.add(item1);
    myBrochure.add(item2);
   myBrochure.add(item3);
    myBrochure.display();
    
 // TEST 3   
 // Test the add method (version 2)
    myBrochure.add(987,"Coloring Book",9.75);
   myBrochure.add(876,"Magic Marker",3.75);
    myBrochure.display();
    
 //TEST 4 
 // Testing encapsulation - item 1 will be changed in client - should not change in Brochure
    System.out.print("\nChanged LOCAL item " + item1.toString() + " to " );  
    item1.setDescription("Pencils (10 count)");
    System.out.println(item1.toString());
    System.out.println("Change should NOT be reflected in the Brochure!");
    myBrochure.display();
    
 // TEST 5   
 // Testing update methods
    System.out.println("\nChanged first item in the Brochure");
    myBrochure.update(item1.getItemId(),"Pencils (15 count)");
    myBrochure.update(item1.getItemId(),1.75);
    myBrochure.display();
    
 // TEST 6
 // Tesing price increase method
    System.out.println("\nIncreasing prices by 10%");
    myBrochure.priceIncrease(.10);
    myBrochure.display();
    
 // Price increase should not be reflected in local instance
    System.out.println("\nLOCAL item2 should contain original price\n" + 
                       item2.toString());
 
 // Test 7
 // Test the getBrochureItem method
    System.out.println("\nLocating a BrochureItem");
    BrochureItem cat = myBrochure.getBrochureItem(900);
    if (cat != null)
       System.out.println("Found item 900!");
    else
       System.out.println("Didn't find item 900!");
       
    BrochureItem cat2 = myBrochure.getBrochureItem(900456);
    if (cat2 != null)
       System.out.println("Found item 900456!");
    else
       System.out.println("Didn't find item 900456!");
       
 // TEST 8
 // Test the toString() method of the Brochure class
    System.out.println("\nHere is the final list: " + myBrochure.toString());
 
 //****** REMOVE THIS LINE for your final test */
 }
 }
