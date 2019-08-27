/**
Relateable exams

@author Jeffrey Wan
*/
public class RelateableExams 
{
  	public static void main(String[] args) 
  	{
  		//Exam 1 had 100 questions and missed 20
		FinalExam exam1 = new FinalExam(100, 20);
		
		//Exam 2 had 100 questions and missed 30
		FinalExam exam2 = new FinalExam(100, 30);
		
		System.out.println("Exam 1: " + exam1.getScore());
		System.out.println("Exam 2: " + exam2.getScore());
		
		//comparisons
		if(exam1.isEqual(exam2))
			System.out.println("The exams are equal.");
		
		if(exam1.isGreater(exam2))
			System.out.println("Exam 1 is greater than exam 2.");
			
		if(exam1.isLess(exam2))
			System.out.println("Exam1 is less than exam2.");
			
			
  	}//end main()
}//end class