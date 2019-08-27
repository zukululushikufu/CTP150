/**
Bank account with exceptions driver

Date: 4/29/19
@author Jeffrey Wan
*/

public class AccountTest
{
	public static void main(String[] args)
	{
		try
		{
			//instantiate with negative balance to test exception handling
			BankAccount account = new BankAccount(-100.00);
		}
		catch(NegativeStartingBalance negBal)
		{
			System.out.println(negBal.getMessage());
		}
	}
}
