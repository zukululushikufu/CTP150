/**
FileWrite demo
File 6
@author Jeffrey Wan
@date 2/11/19
*/
import java.util.Scanner;
import java.io.*;	//needed for files

public class FileWriteDemo
{
	public static void main(String[] args) throws IOException
	{
		//variables
		int numFriends = 0;
		String fileName = "";
		String friendName = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		//prompts and inputs
		System.out.println("How many friends do you have: ");
		numFriends = keyboard.nextInt();
		keyboard.nextLine();	//consume new line character
		
		//naming file
		System.out.println("Enter the file name: ");
		fileName = keyboard.nextLine();
		
		//creating a new file who's name is fileName
		File file = new File(fileName);
		
		//checks if the file exists to prevent file overwrite
		if (file.exists())
		{
			System.out.println("The file exists");
			System.exit(0);
		}
		
		//instantiates PrintWriter object that writes into a file
		PrintWriter outputFile = new PrintWriter(file);
		
		for(int i = 1; i <= numFriends; i++)
		{
			System.out.println("Enter the name of a friend: ");
			friendName = keyboard.nextLine();
			
			//writes the inputted name from friendName into file that has our inputted file name
			outputFile.println(friendName);
		}
		
		outputFile.close();	//every time we work with a file we must remember to close it once we're done
		System.out.println("Data was written to the file.");
		
	}//end main()
}//end FileWriteDemo