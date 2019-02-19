/**
Automatically generated BankAccount class
@author Jeffrey Wan
date: 2/18/19
*/

public class BankAccount 
{
	//private attributes
  	private double balance;
  
  	//constructors
  	public BankAccount() 
	{
		balance = 0.0;
  	}
	
	/**
	This constructor sets starting balance to the value
	passed into the arguement
	@param startBalance The starting balance
	*/
	public BankAccount(double startBalance) 
	{
		this.balance = startBalance;
	}
	
	/**
	This constructor sets the starting balance
	to a value in the String argument. Typically used with JOptionPane
	@param str The starting balance, as a String
	*/
	public BankAccount(String str) 
	{
		this.balance = Double.parseDouble(str);
	}
	
	/**
	The deposit method makes a deposit into the account
	@param amount The amount to add to the balance field
	*/
	public void deposit(double amount) 
	{
		balance += amount;
	}
	
	/**
	The deposit method makes a deposit into the account
	@param str The amount to add to the balance field, as a String
	*/
	public void deposit(String str) 
	{
		balance += Double.parseDouble(str);
	}
	
	/**
	The withdraw method that takes money from the account
	@param amount The amount to subtract from the balance field
	*/
	public void withdraw(double amount) 
	{
		balance -= amount;
	}
	
	/**
	The withdraw method that takes money from the account
	@param str The amount to subtract from the balance field, as a String
	*/
	public void withdraw(String str) 
	{
		balance -= Double.parseDouble(str);
	}
	
	/**
	The balance attribute's getter
	@return the value stored in balance
	*/
	public double getBalance() 
	{
		return balance;
	}
	
	/**
	The setBalance method changes the value in the balance attribute
	@param balance The value to store in the balance field
	*/
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	/**
	The setBalance method changes the value in the balance attribute
	@param str The value to store in the balance field, as a String
	*/
	public void setBalance(String str) 
	{
		this.balance = Double.parseDouble(str);
	}
}