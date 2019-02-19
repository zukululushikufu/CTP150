/**
Chapter 3 review
File 1
@author Jeffrey Wan
@date 2/11/19
*/

public class Review
{
	public static void main(String[] args)
	{
		double number = 345467.6789;
		int a = 0;
		
		//puts a comma if we're in the thousands and rounds to 2 dp
		System.out.printf("A large number %,.2f\n", number);
		
		//add a dollar sign
		System.out.printf("A large number " + "$" + "%,11.2f\n", number);
		
		//adding a percent sign using %%
		System.out.printf("A large number %,.2f%%\n", number);
		
		//conditional operator
		number = (a < 0)? 0:5;	// if a < 0, number = 0, else number = 5
		System.out.printf("A number %,.2f%%\n", number);
		
		//early termination of if statement
		int x = 90, y = 55, ans = 10;
		
		if(x == y);	// <- notice this semi colon here
			ans *= 2; 
			
		System.out.println("x and y are: " + x + ", " + y); 
		System.out.println("answer is: " + ans);
		
		//declaring variables in control structures
		int z = 10;
		if (z == 10)
			{
				int w = 5;
				w += z;
				System.out.println(w);	//works correctly
			}
		//System.out.println(w); <- if this was here it would not work because w can't be accessed in main
		int j = 40;
		int k = 30;
		int answer = 0;
		
		if (j == k)	//false
			answer = k + 10;
			
		System.out.println(answer + " is what is in answer.");
		
		//comparing characters
		char ch = 'c';
		if (ch == 'c')	//we can use == for char
			System.out.println(ch);
		
		//comparing Strings
		String str = "Jeffrey";
		String str2 = "Chong";
		
		if (str.compareTo(str2) > 0)
			System.out.println(str + " is greater than " + str2);
			
		if(str.equals(str2))
			System.out.println(str + " is equal to " + str2);
		else
			System.out.println(str + " is NOT equal to " + str2);
	
	}//end main()

}//end Review
