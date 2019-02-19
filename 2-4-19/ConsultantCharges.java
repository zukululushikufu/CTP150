/**
This program demonstrates conditional operator
File 5
@author: Jeffrey Wan
@date: 2/4/19
*/
import javax.swing.JOptionPane;

public class ConsultantCharges
{
	public static void main(String[] args)
	{
		double hours = 0;
		double charges = 0;
		String input = "";
		
		//get the number of hours worked
		input = JOptionPane.showMessageDialog("How many hours were worked?");
		hours = Double.parseDouble(input);
		
		//if horus < 5 then store 5 into hours, otherwise the number is assigned 
		hours = hours < 5 ? 5 : hours;
		
		charges = 50.0 * hours;
		
		JOptionPane.showMessageDialog(null, "The charges are $" + charges);
	}//end main()
}//end ConsultantCharges