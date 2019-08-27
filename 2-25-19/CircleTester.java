/**
This tests and compares circles
File 2
@author Jeffrey Wan
date: 2/25/19
*/

public class CircleTester 
{
  	public static void main(String[] args) 
  	{
  		Circle c1 = new Circle(3);	//circle c1 with a radius of 3cm
		Circle c2 = new Circle(3);	//circle c2 with a radius of 3cm
		//do not do c1 = c2. This sets the memory address of c2 into c1
		
		//do not do this, this compares the memory addresses stored in both reference variables
		if (c1 == c2)
			System.out.println("Equal");
		else
			System.out.println("c1 is not equal to c2");
		
		//using equals method
		//this is equal because they are comparing the value of both object's attributes
		if(c1.equals(c2))
			System.out.println("Equals");
		else
			System.out.println("c1 is not equal to c2");
  	}

}