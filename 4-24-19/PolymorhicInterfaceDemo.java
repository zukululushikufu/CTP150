/**
Disc Drivers

@author Jeffrey Wan
*/

public class PolymorhicInterfaceDemo
{
	public static void main(String[] args)
	{
		//isntantations
		CompactDisc cd = new CompactDisc("Greatest Hits", "GGD", 18.95);
		Dvd dvd = new Dvd("Wheels of Fury", 137, 122.95);
		
		//outputs
		System.out.println("Item 1: " + cd.getTitle());
		showPrice(cd);
		
		System.out.println("Item 2: " + dvd.getTitle());
		showPrice(dvd);
	}//end main()
	
	//private method
	private static void showPrice(RetailItem item)
	{
		System.out.printf("Price: $%,.2f\n", item.getRetailPrice()); 
	}
}