/**
Demo abstract

@author Jeffrey Wan
*/

public class CompScienceStudentDemo
{
	public static void main(String[] args)
	{
		CompSciStudent csStudent = new CompSciStudent("Jeffrey Wan", "1225704", 2017);
		
		csStudent.setMathHours(12);
		csStudent.setCsHours(20);
		csStudent.setGenEdHours(40);
		
		System.out.println(csStudent);
		
		System.out.println("Hours remaining: " + csStudent.getRemainingHours());
	}
}

