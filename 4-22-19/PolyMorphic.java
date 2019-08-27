
public class PolyMorphic 
{
  	public static void main(String[] args) 
	{
		//create an array of GradedActivity referenced
		GradedActivity[] tests = new GradedActivity[3];
		
		//The first test is a regular exam
		tests[0] = new GradedActivity();
		tests[0].setScore(95);
		
		//second test is passFail the student missed 5/20. Passing score is 60
		tests[1] = new PassFailExam(20, 5, 60);
		
		//third exam there are 50 questions and students missed 1
		tests[2] = new FinalExam(50, 7);
		
		//display the grades
		for(int index = 0; index < tests.length; index++)
		{
			System.out.println("Test" + (index + 1) + " score is: " + tests[index].getScore() +
										", grade is " + tests[index].getGrade());
		}
		
		//polymorphism example
		GradedActivity exam1 = new FinalExam(50, 12);
		System.out.println("\n Exam 1: ");
		displayGrades(exam1);
  	}//end main
	
	public static void displayGrades(GradedActivity g)
	{
		System.out.println(	"Score: " + g.getScore() + 
									"\nGrade: " + g.getGrade());
	}

}