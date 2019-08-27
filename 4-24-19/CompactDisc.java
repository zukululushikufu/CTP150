/**
CD class

@author Jeffrey
*/

public class CompactDisc implements RetailItem
{
	//private attributes
	private String title;
	private String artist;
	private double retailPrice;
	
	//constructors
	public CompactDisc(String title, String artist, double retailPrice)
	{
		this.title = title;
		this.artist = artist;
		this.retailPrice = retailPrice;
	}
	
	//getters
	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}	
	
	@Override
	public double getRetailPrice()
	{
		return retailPrice;
	}
}
