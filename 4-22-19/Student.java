/**
The student class is abstract

date: 4/22/19
@author Jeffrey Wan
*/

public abstract class Student
{
	private String name;
	private String idNumber;
	private int yearAdmitted;
	
	public Student(String n, String id, int year)
	{
		name = n;
		idNumber = id;
		yearAdmitted = year;
	}
	
	public String toString()
	{
		String str = "";
		
		str += ("Name: " + name);
		str += ("\nidNumber : " + idNumber);
		str += ("\nYear Admitted: " + yearAdmitted);
		
		return str;
	}
	
	/**
	getRemainingHour is abstract and overrides the superClass version
	
	@return The hours remaining for the student
	*/
	
	public abstract int getRemainingHours();
}