/**
For loop
File 5
@author Jeffrey Wan
@date 2/11/19
*/

public class Squares
{
	public static void main(String[] args)
	{
		int number = 0;	//loop control variable
		
		System.out.println("Number		Number Squared");
		System.out.println("________________________");
		
		for (number = 1; number <= 10; number++)
		{
			System.out.println(number + "\t\t\t\t" + number*number);
		}
	
	}//end main()
}//end Squares

// Sentinel - special character to stop the loop