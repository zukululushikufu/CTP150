/**
Writing binary files 

Date: 4/29/19
@author Jeffrey Wan
*/
import java.io.*;

public class WriteBinaryFile
{
	public static void main(String[] args) throws IOException
	{
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		FileOutputStream fStream = new FileOutputStream("numbers.dat");
		DataOutputStream oStream = new DataOutputStream(fStream);
		
		System.out.println("Writing numbers to a file . . .");
		
		for(int index = 0; index < numbers.length; index++)
		{
			oStream.writeInt(numbers[index]);
		}
		
		oStream.close();
		
	}
}