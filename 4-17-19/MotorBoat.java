/**
MotorBoat child class

Date: 4/17/19
@author Jeffrey Wan
*/

public class MotorBoat extends Boat
{
	//motorBoat attributes
	private double horsePower;
	
	//constructor
	public MotorBoat(String owner, int length, double hp)
	{
		super(owner, length);
		horsePower = hp;
	}
	
	public MotorBoat()
	{
		this(" ", 0, 0.0);
	}
	
	public boolean equals(MotorBoat test)
	{
		return (super.equals(test) && this.horsePower == test.horsePower) ? true : false;
	}
	
	public String toString()
	{
		String str = (	super.toString() +
							"\nHorse Power: " + horsePower);
							
		return str;
	}
	
}//end class