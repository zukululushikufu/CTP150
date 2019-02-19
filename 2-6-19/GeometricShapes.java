/**
Write a program to calculate the area of a triangle, circle, or rectangle
File 2
@author Jeffrey Wan
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GeometricShapes
{
	public static void main(String[] args)
	{
		//variables
		String shape = "";
		char ch = ' ';
		Scanner input = new Scanner(System.in);
		
		//prompts and inputs
		System.out.println("Enter the area you want: Rectangle(1), Triangle(2), Circle(3)");
		shape = input.nextLine();
		ch = shape.charAt(0);
		
		//chooses the shape they wish to calculate the area for
		switch(ch)
		{
			case '1':
				areaRectangle();
				break;
			case '2':
				areaTriangle();
				break;
			case '3':
				areaCircle();
				break;
			default:
				System.out.println("Invalid entry. Enter a number from 1 - 3.");
				System.exit(0);
		}//end switch
	}//end main()
	
	public static void areaRectangle()
	{
		String length = JOptionPane.showInputDialog(null, "Enter the length of the rectangle: ");
		double rectLength = Double.parseDouble(length);
		
		String width = JOptionPane.showInputDialog(null, "Enter the width of the rectangle: ");
		double rectWidth = Double.parseDouble(width);
		
		double area = rectLength * rectWidth;
		System.out.println("The area of the rectangle is: " + area);
	}//end areaRectangle()
	
	public static void areaTriangle()
	{
		String height = JOptionPane.showInputDialog(null, "Enter the height of the triangle: ");
		double h = Double.parseDouble(height);
		
		String base = JOptionPane.showInputDialog(null, "Enter the base of the triangle: ");
		double b = Double.parseDouble(base);
		
		double area = (1.0/2.0) * (b * h);
		System.out.println("The area of the triangle is: " + area);
	}//end areaTriangle()
	
	public static void areaCircle()
	{
		String radius = JOptionPane.showInputDialog(null, "Enter the radius of the circle: ");
		double r = Double.parseDouble(radius);
		
		double pi = Math.PI;
		
		double area = pi * Math.pow(r,2);
		//System.out.println("The area of the circle is: " + area);
		System.out.printf("Area: %.2f", area);	//%.2f means a float placeholder that has 2 decimal places
	}//end areaCircle()
}//end class

/*Notes
* %,.2f - > will put a comma where necessary. eg: 3,000.00
*/