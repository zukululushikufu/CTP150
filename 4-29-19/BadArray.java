/**
Exception handling
Try-catch

Date: 4/29/19
@author Jeffrey Wan
*/

public class BadArray
{
	public static void main(String[] args)
	{
		 int[] numbers = {1, 2, 3};
		 
		 try
		 {
			 for(int index = 0; index <= 3; index++)
			 {
			 	System.out.println(numbers[index]);
			 }
		 }
		 catch(ArrayIndexOutOfBoundsException outBounds)
		 {
		 	System.out.println("Index value exceeds array length");
		 }
		 
	}
 }