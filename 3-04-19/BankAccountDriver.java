/**
Bank account driver utilizing an Array List
File 5

@author Jeffrey Wan
date: 3/4/19
*/

import java.util.ArrayList;

public class BankAccountDriver
{
	public static void main(String[] args)
	{
		//instantiate array list
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		
		//add a few objects
		list.add(new BankAccount(100.0));
		list.add(new BankAccount(500.00));
		list.add(new BankAccount(1500.00));
		
		//display them
		for(int index = 0; index < list.size(); index++)
		{
			//assign the object at list.get(index) to the reference variable account
			BankAccount account = list.get(index);
			
			//display
			System.out.println("Account at index: " + index + " Balance: " + account.getBalance());
		}
	}//end main()
}//end BankAccountDriver