/**
Utilities class
This class can be used for any other class we want to use its methods in
File 4

@author Jeffrey Wan
date: 2/27/19
*/

public class Utilities 
{
  public static String toMonthName(int month) 
  {
 		//declare variables
		String monthName = "";
		
		switch(month)
		{
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
			default:
				System.out.println("Month index out of bounds. Month number > 12. Give a number less or equal to 12.");
				break;	
		}
		
		return monthName;
  }

}