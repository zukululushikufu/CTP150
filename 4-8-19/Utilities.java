/**
Utility class
File 5

Date:4/8/19
@author Jeffrey Wan
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Utilities
{
	public static void searchForProgrammer(ArrayList<ProgrammingLanguage> langs)
	{
		//instantiates
		Scanner keyboard = new Scanner(System.in);
		String name = "";
		
		//prompts
		System.out.print("Which programmer are you looking for: ");
		name = keyboard.nextLine();
		boolean found = false;
		
		for(ProgrammingLanguage p : langs)
		{
			if(p.getDev().getName().equalsIgnoreCase(name))
			{
				System.out.println(p);
				System.out.println("WE GOT EM");
				found = true;
			}
		}
		
		if(!found)
		{
			System.out.println("Sorry man that dude doesn't exist");
		}
		
		keyboard.close();
	}//end searchForProgrammer
	
	public static void searchForLanguage(ArrayList<ProgrammingLanguage> langs)
	{
		//instantiates
		Scanner keyboard = new Scanner(System.in);
		String name = "";
		
		//prompts
		System.out.print("Which language are you looking for: ");
		name = keyboard.nextLine();
		boolean found = false;
		
		for(ProgrammingLanguage p : langs)
		{
			if(p.getName().equalsIgnoreCase(name))
			{
				System.out.println(p);
				System.out.println("WE GOT EM");
				found = true;
			}
		}
		
		if(!found)
		{
			System.out.println("Sorry man that bahasa doesn't exist");
		}
		
		keyboard.close();
	}//end searchForLanguage

}//end utilities