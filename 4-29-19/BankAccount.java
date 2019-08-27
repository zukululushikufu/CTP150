/**
Own exception class
BankAccount

Date: 4/29/19
@author Jeffrey Wan
*/

public class BankAccount
{
	//attributes
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	
	//This constrcutor makes sure no negative
	public BankAccount (double startBalance) throws NegativeStartingBalance
	{
		if(startBalance < 0)
		{
			throw new NegativeStartingBalance(startBalance);
		}	
			balance = startBalance;
	}
	
	public BankAccount(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	//getters and setters
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void deposit(String str)
	{
		balance += Double.parseDouble(str);
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void wihtdraw(String str)
	{
		balance -= Double.parseDouble(str);
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setBalance(String str)
	{
		this.balance = Double.parseDouble(str);
	}
	
	public double getBalance()
	{
		return balance;
	}
}