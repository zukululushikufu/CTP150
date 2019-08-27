/**
Try-catch
File exception

date: 4/29/19
@author Jeffrey Wan
*/

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class SalesData
{
	public static void main(String[] args)
	{
		File file;
		Scanner inputFile;
		String fileName = "salesData";
		int months = 0;
		double oneMonth = 0;
		double totalSales = 0;
		double averageSales = 0;
				
		try
		{
			//attempt to open file
			file = new File(fileName);
			inputFile = new Scanner(file);
		
			while (inputFile.hasNext())
			{
				oneMonth = inputFile.nextDouble();
				
				//accumulate sales
				totalSales += oneMonth;
				
				months++;
			}
			
			inputFile.close();
			
			averageSales = totalSales / months;
			
			//display results
			JOptionPane.showMessageDialog(null, String.format(	"Number of months: %d\n" +
																				"Total Sales: $%,.2f\n" +
																				"Average sales: $%,.2f\n",
																				months, totalSales, averageSales));
		}//end try
		catch(FileNotFoundException noFile)	//exception 1
		{
			JOptionPane.showMessageDialog(null, "Unable to find: " + fileName);
		}
		catch(InputMismatchException wrongData) //exception 2
		{
			JOptionPane.showMessageDialog(null, "Non numeric data found in the file");
		}
		
		JOptionPane.showMessageDialog(null, "Done.");
		System.exit(0);
		
	}
}