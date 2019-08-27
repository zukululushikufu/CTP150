/**
Try-catch
File exception

date: 4/29/19
@author Jeffrey Wan
*/

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class OpenFileNoTry
{
	public static void main(String[] args)
	{
		File file;
		Scanner inputFile;
		String fileName;
		
		fileName = JOptionPane.showInputDialog("Enter the name of a file: ");
		
		try
		{
			//attempt to open file
			file = new File(fileName);
			inputFile = new Scanner(file);
		}
		catch(FileNotFoundException noFile)
		{
			JOptionPane.showMessageDialog(null, "Unable to find: " + fileName);
		}
		
		JOptionPane.showMessageDialog(null, "Done.");
		System.exit(0);
		
	}
}