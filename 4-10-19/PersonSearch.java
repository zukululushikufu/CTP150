/**
This is testing concepts in chapter 9
File 2

Date: 4/10/19
@author Jeffrey Wan
*/
//imports everything lmao
import java.util.*;

public class PersonSearch
{
	public static void main(String[] args)
	{
		//variables
		String lookUp = "";
		String lookUp2 = "";
		
		String[] names = {"Jeffrey, Wan", "Ka Heng, Chong", "Daya, Rusli", "Yin Hong, Khoo"};
		
		Scanner keyboard = new Scanner(System.in);
		
		//prompts
		System.out.print("Enter the first 3 letters of the last name to look up: ");
		lookUp = keyboard.nextLine();
		lookUp2 = (lookUp.substring(0,1).toUpperCase());
		lookUp = (lookUp2 + lookUp.substring(1,3).toLowerCase());
		
		//display names that match
		System.out.println("Here are the names that match: ");
		
		for(String people : names)
		{
			if(people.startsWith(lookUp))
				System.out.println(people);
		}
		
		
		//trimming
		System.out.println("________________trim()________________");
		String name = "                    Jef";
		String fName = name.trim();
		System.out.println(name);
		System.out.println(fName);
		
		//concatenation
		System.out.println("________________concat()_______________");
		String lName = " Wan";
		String fullName = fName.concat(lName);
		System.out.println(fullName);
		
		//converting integer to String
		System.out.println("________________integer to String________________");
		int num = 123;
		String str = Integer.toString(num);
		System.out.println(str);
		
		//index of a String
		System.out.println("________________index of a String________________");
		String sentence = "There is one and only one way to take one course in Computer Science";
		int position = 0;
		position = sentence.indexOf("one");	//gives us the index of the first occurence of one
		
		while(position != -1)
		{
			System.out.println(position);
			position = sentence.indexOf("one", ++position);
		}//end while
		
		//displaying min/max value
		System.out.println("The smallest value for an int variable is: " + Integer.MIN_VALUE);
		System.out.println("The largest value for an int variable is: " + Integer.MAX_VALUE);
		
		
		System.out.println("The smallest value for a double variable is: " + Double.MIN_VALUE);
		System.out.println("The largest value for an double variable is: " + Double.MAX_VALUE);
		
		//Autoboxing a value
		//autoboxing is turning a primitive data type into its class version
		//eg: int -> Integer
		System.out.println("______________Autoboxing and Unboxing_____________________");
		Integer autoboxText = new Integer(7);
		
		System.out.println("This creates an integer object initialized with a value of: " + autoboxText);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer myInt = 5;
		list.add(myInt);
		System.out.println(myInt);
		
		//unboxing
		int primitiveNumber = list.get(0);
		System.out.println(primitiveNumber);
	}//end main()
}