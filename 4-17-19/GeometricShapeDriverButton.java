
import java.util.*;
import java.io.*;

public class GeometricShapeDriverButton {

    
  public static void main(String[] args) throws IOException
  {
  		ArrayList<GeometricShape> shapes = new ArrayList<GeometricShape>();
		File infile = new File("shapeDims.csv");
		Scanner scan = new Scanner(infile);
		
		createShapesList(shapes, scan);
		displayShapes(shapes);
  	
		//buttons and menu??!?!?!?
		int option = 0;
		
		while (option != 4)
		{
			//keyboard input instantiation
			Scanner keyboard = new Scanner(System.in);
			
			//prompts
			System.out.println(	"Select an option from the menu: " + 
										"\n1.) Color " +
										"\n2.) Circle" +
										"\n3.) Rectangle " +
										"\n4.) Exit");
			option = keyboard.nextInt();
			
			//menu
			switch(option)
			{
				case 1:
					Utilities.searchShapesForColor(shapes);
					break;
				case 2:
					searchForCircle(shapes);
					break;
				case 3:
					searchForRectangle(shapes);
					break;
				case 4:
					System.exit(0);
					break;
			}//end switch
		
		}//end while
  }//end main
  
  
  	public static void searchForCircle(ArrayList<GeometricShape> shapes)
  	{
  		for(GeometricShape c: shapes)
		{
			if(c instanceof Circle)
			{
				System.out.println(c);
			}
		}
  
  	}
  
  	public static void searchForRectangle(ArrayList<GeometricShape> shapes)
 	{
  		for(GeometricShape r: shapes)
		{
			if(r instanceof Rectangle)
			{
				System.out.println(r);
			}
		}
  	}
  
  public static  void displayShapes(ArrayList<GeometricShape> shapes)
  {
  		for (GeometricShape g: shapes)
		{
			if(g instanceof Circle)   {
			   System.out.println("Circle");
				System.out.println(g);
				
				System.out.println("Circumference of the circle :");
				   double circum = 0;
				circum = ((Circle)g).getCircumference();	//casting g(GeometricShape) to a Circle
					System.out.printf("Circumference is: %,.2f\n", circum);
					
			System.out.println("  __________Area of circle_____________");
			   
				   double area = 0;
				area = ((Circle)g).getArea();
					System.out.printf("Area is: %,.2f\n", area);
					
			}//end if
		
		
		}//end for
		
		for(GeometricShape g: shapes)
		{
			if (g instanceof Rectangle)
			{
				System.out.println("Rectangle");
				System.out.println(g);
				
				//print perimeter
				System.out.println("The perimeter of the rectangle is: ");
				System.out.println(((Rectangle)g).getPerimeter());
				
				//g is a GeometricShape object but we are casting it to a rectangle
				
				//print area
				System.out.println("The area of the rectangle is: ");
				System.out.println(((Rectangle)g).getArea());
			}
		
		}//end for
  }//end display

  
  public static  void createShapesList(ArrayList<GeometricShape> shapes, Scanner scan) throws IOException
  {
  	 	String str = " ";
		while (scan.hasNext())
		{
			str = scan.nextLine();
			String[] tokens = str.split(",");
			if (tokens[0].equalsIgnoreCase ("c"))
					shapes.add(new Circle(Double.parseDouble(tokens[2]),tokens[1]));
		   else 
			   if (tokens[0].equalsIgnoreCase ("r"))
					shapes.add(new Rectangle(Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),tokens[1]));
			else 
			   System.out.println("We must have some bad data"); 
		}//end while
			
  
  
  }

}//end class