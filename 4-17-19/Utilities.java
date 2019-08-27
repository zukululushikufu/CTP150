/**
Utilities class to search for color
File 3
Date: 4/17/19

@author Jeffrey Wan
*/
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Utilities
{
	public static void searchShapesForColor(ArrayList<GeometricShape> shapes)
	{
		//instantiations and variables
		Scanner keyboard = new Scanner(System.in);
		String str = "";
		
		//prompts
		System.out.print("Enter the color of the shape you are looking for: ");
		str = keyboard.nextLine();
		
		//search
		for (GeometricShape g : shapes)
		{
			if(g.getColor().equalsIgnoreCase(str))
			{
				if(g instanceof Circle)
					System.out.println(str + " Circle");
				if(g instanceof Rectangle)
					System.out.println(str + " Rectangle");
				
				System.out.println(g);
			}
		}
	}
 
}