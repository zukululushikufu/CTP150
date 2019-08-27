/**
This is the Bank Accoutn class definition
File 4

@author Jeffrey
date: 3/4/19
*/

public class BankAccount
{
	//private attributes
	private double balance;	//account balance
	
	/**
	This constructor initializes the starting balance to 0.0
	*/
	public BankAccount()
	{
		balance = 0.0;
	}
	
	/**
	This constructor initializes starting balance to the value passed	by the argument
	
	@param startBalance The starting balance indicated by the user
	*/
	public BankAccount(double startBalance)
	{
		this.balance = startBalance;
	}
	
	/**
	This constructor initializes the starting balance to the value in the String argument
	
	@param str
	*/
	public BankAccount(String str)
	{
		balance = Double.parseDouble(str);
	}

	/**
	This deposit method makes a deposit into the account
	
	@param amount The amount to add to the balance field
	*/
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	/**
	This deposit method makes a deposit into the account
	
	@param amount The amount to add to the balance field, as a String
	*/
	public void deposit(String str)
	{
		balance += Double.parseDouble(str);
	}
	
	/**
	This withdraw method makes a withdrawal from the account
	
	@param amount The amount to take from the balance field
	*/
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	/**
	This deposit method makes a withdrawal from the account
	
	@param amount The amount to take from the balance field, as a String
	*/
	public void withdraw(String str)
	{
		balance -= Double.parseDouble(str);
	}
	
	/**
	The setBalance method sets the account balance
	
	@param balance The value to store in the balance field
	*/
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	/**
	The setBalance method sets the account balance
	
	@param balance The value to store in the balance field, as a String
	*/
	public void setBalance(String str)
	{
		this.balance = Double.parseDouble(str);
	}
	
	/**
	The getBalance method returns the balance to the user
	
	@return The account balance
	*/
	public double getBalance()
	{
		return balance;
	}
}//end BankAccount