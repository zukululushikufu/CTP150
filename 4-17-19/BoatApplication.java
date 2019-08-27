/**
Boat application driver

Date: 4/17/19
@author Jeffrey Wan
*/

public class BoatApplication
{
	public static void main(String[] args)
	{
		//instantiating parent
		//Boat myBoat = new Boat();
		MotorBoat myBoat = new MotorBoat("Yerffej Naw", 23, 550);
		System.out.println(myBoat);
		
		//itty bitty child class instantiation
		MotorBoat urBoat = new MotorBoat("Nayrb Mil", 12, 125);
		System.out.println(urBoat);
		
		if (urBoat.equals(myBoat))
			System.out.println("These are the same boats dumb dumb");
		else
			System.out.println("Y'alls needs some new eyeballs man");
			
		urBoat.setOwner("Chong Lee Ng");
		System.out.println(urBoat);
	
	}
}