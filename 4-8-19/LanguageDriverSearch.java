/**
LanguageDriver class
File 3

Date: 4/8/19
@author: Jeffrey Wan
*/
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class LanguageDriverSearch
{
	public static void main(String[] args) throws IOException
	{
		//instantiate arrayList
		ArrayList<ProgrammingLanguage> langs = new ArrayList<ProgrammingLanguage>();
		
		//fill er up
		fillLanguageArrayList(langs);
		
		//display em
		displayLanguages(langs);
		
		//search for programming
		Utilities.searchForProgrammer(langs);
		
		//search for programming Language
		Utilities.searchForLanguage(langs);
	}//end main()
	
	public static void fillLanguageArrayList(ArrayList<ProgrammingLanguage> langs) throws IOException
	{
		//instantiations
		File langInfo = new File("programming language and developers.csv");
		
		//check existence
		if(!langInfo.exists())
		{
			System.out.println("File does not exist. Closing program homs.");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(langInfo);
		
		//tokenzing
		String str = " ";
		String[] tokens;
		
		while(inputFile.hasNext())
		{
			str = inputFile.nextLine();
			tokens = str.split(",");
			
			langs.add(new ProgrammingLanguage(tokens[0], Integer.parseInt(tokens[3]), tokens[1], tokens[2]));
		}
		
		inputFile.close();
	}//end fillLanguageArray()
	
	public static void displayLanguages(ArrayList<ProgrammingLanguage> langs)
	{
		for(ProgrammingLanguage p : langs)
		{
			System.out.println(p);
		}
	}//end displayLanguages()
	
}//end class