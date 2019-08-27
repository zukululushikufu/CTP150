/**
CompSciStudent subclass
*/

public class CompSciStudent extends Student
{
	//constants and variables
	private final int MATH_HOURS = 20;
	private final int CS_HOURS = 40;
	private final int GEN_ED_HOURS = 60;
	
	private int mathHours;
	private int csHours;
	private int genEdHours;
	
 	//constructor
	public CompSciStudent(String n, String id, int year)
	{
		super(n, id, year);
	}
	
	public void setMathHours(int math)
	{
		mathHours = math;
	}
	
	public void setCsHours(int cs)
	{
		csHours = cs;
	}
	
	public void setGenEdHours(int genEd)
	{
		genEdHours = genEd;
	}
	
	/**
	The getRemainingHours method returns the number of hours remaining to be taken
	
	@return The number of hours remaining that need to be taken
	*/
	@Override
	public int getRemainingHours()
	{
		//variables
		int reqHours = 0;
		int remainingHours = 0;
		
		reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
		remainingHours = reqHours - (mathHours + csHours + genEdHours);
		
		return remainingHours;
	}
	
	@Override
	public String toString()
	{
		String str = "";
		
		str += (super.toString());
		str += ("\n Major: Computer Science ");
		str += ("\n Math hours taken: " + mathHours);
		str += ("\n CS hours taken: " + csHours);
		str += ("\n General Education hours taken: " + genEdHours);
	
		return str;
	}
}