/**
Rainfall class definite
File 2
@author Jeffrey Wan
date: 2/27/19
*/
public class Rainfall 
{
	//private attributes
  	private String location;
  	private double rainfall[];

	//constructors
  	public Rainfall() 
  	{
		location = "";
		rainfall = new double[12];
  	}

  	public Rainfall(String location, double[] rainfall) 
  	{
		this.location = location;
		this.rainfall = new double[12];
			
			//copying argument's array into our attribute's array
			for (int index = 0; index < rainfall.length; index++)
			{
				this.rainfall[index] = rainfall[index];
			}
  	}

  	public String getLocation() 
  	{
  		return location;
  	}

  	public double[] getRainfall() 
  	{
  		return rainfall;
  	}

  	public void setLocation(String location) 
  	{
		this.location = location;
  	}

  	public void setRainfall(double[] rainfall) 
  	{
		this.rainfall = new double[12];
			for(int index = 0; index < rainfall.length; index++)
			{
				this.rainfall[index] = rainfall[index];
			}
  	}

  	public double getSum() 
  	{
		//declare accumulator
		double sum = 0;
		
  		for(int index = 0; index < rainfall.length; index++)
		{
			sum += rainfall[index];
		}
		
		return sum;
  	}

  	public double getMax() 
  	{
		//set initial value to max value
  		double max = rainfall[0];
		
		//compare array[index + 1] to max value
		for(int index = 1; index < rainfall.length; index++)
		{
			if (rainfall[index] > max)
				max = rainfall[index];
		}
		
		return max;
  	}

  	public double getMin() 
  	{
		//set initial value to minimum value
  		double min = rainfall[0];
		
		//compare array[index + 1] to min value
		for(int index = 1; index < rainfall.length; index++)
		{
			if (rainfall[index] < min)
				min = rainfall[index];
		}
		
		return min;
  	}

  	public double getAverage() 
  	{
		//declare variables
		double sum = 0;	//accumulator
		double average = 0;
				
  		for(int index = 0; index < rainfall.length; index++)
		{
			sum += rainfall[index];
		}
		
		average = sum/rainfall.length;
		
		return average;
		//return getSum()/rainfall.length; also works. This may be preferable.
  	}

  	public String toString() 
  	{
		String str = "";
		
		for (int index = 0; index < rainfall.length; index++)
		{
			str += ("\n" + Utilities.toMonthName(index + 1) + ": " + rainfall[index] + "cm");
		}
		
		return str;
  	}

}