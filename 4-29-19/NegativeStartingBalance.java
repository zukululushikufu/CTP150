/**
The exception class

Date: 4/29/19
@author Jeffrey Wan
*/

public class NegativeStartingBalance extends Exception
{
	public NegativeStartingBalance()
	{
		super("Error: Negative starting balance.");
	}
	
	public NegativeStartingBalance(double startBalance)
	{
		super("Error: Negative starting balance: " + startBalance);
	}
	

}