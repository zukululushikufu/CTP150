/**
DVD class

@author Jeffrey Wan
*/

public class Dvd implements RetailItem
{
	//private attributes
	private String title;
	private int runningTime;	//in minutes
	private double retailPrice;
	
	//constructors
	public Dvd(String title, int runningTime, double retailPrice)
	{
		this.title = title;
		this.runningTime = runningTime;
		this.retailPrice = retailPrice;
	}
	
	//getters
	public String getTitle()
	{
		return title;
	}

	public int getRunningTime()
	{
		return runningTime;
	}	
	
	@Override
	public double getRetailPrice()
	{
		return retailPrice;
	}


}