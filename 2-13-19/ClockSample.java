/**
For loop demo with a clock program
File 3
@author Jeffrey Wan
@date 2/13/19
*/

public class ClockSample
{
	public static void main(String[] args) throws InterruptedException
	{
		//variable declaration
		int runningTotal = 0;
		
		for(int hours = 1; hours <= 12; hours++)
		{
			for(int minutes = 0; minutes <= 59; minutes++)
			{
				for(int seconds = 0; seconds <= 59; seconds++)
				{
					System.out.printf("%02d: %02d: %02d\n", hours, minutes, seconds);
					runningTotal++;
					Thread.sleep(1000);
				}
			}//end minutes
		}//end hours
		
		System.out.println("Seconds has looped " + runningTotal + " number of times.");
	}//end main()
}//end ClockSample