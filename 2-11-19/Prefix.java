/**
Loops
File 2
@author Jeffrey Wan
@date 2/11/19
*/

/*	Notes
*	Prefix increment vs postfix increments
*	Only noticeable in expressions
* 	prefix increments towards the operand while post is away
*/

public class Prefix
{
	public static void main(String[] args)
	{
		int number = 4;
		
		System.out.println("number is " + number);
		System.out.println("testing prefix increment with: " + number);
		
		number++;
		
		System.out.println("number is " + number);	//number is 5
		System.out.println("number is " + ++number);	//number is 6
		System.out.println("number is " + number++);	//number is still 6 in expression but incremented afterwards
		System.out.println("number is " + number);	//number is 7
		System.out.println("++number + number++ is " + (++number + number++));
		//the expression above incremented 7 first into 8 and added 8 again
		//resulting in 16 before incrementing number after the expression ends
		System.out.println("number is " + number);	//number is 9
	}//end main()
}//end Prefix