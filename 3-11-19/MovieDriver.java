/**
Movies Driver
File 4

@author Jeffrey Wan
Date: 3/11/19
*/
import java.io.*;

public class MovieDriver
{
	public static void main(String[] args) throws IOException
	{
		//instantiate
		Movies2 myMovies = new Movies2();
		
		//read data
		myMovies.readData();
		
		//display
		myMovies.displayData();
		
	}//end main()
}//end MovieDriver