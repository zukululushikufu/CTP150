/**
FinalExam subclass
File 2

date: 4/22/19
@author Jeffrey Wan
*/

public class FinalExam extends GradedActivity {
	
	//private attributes
  	private int numQuestions;
  	private double numPointsEach;
  	private int numMissed;	

	/**
	FinalExam constructor. Only overloaded provided
	
	@param questions The number of questions in the exam
	@param missed The number of questions the student got wrong/missed
	*/
 	public FinalExam(int questions, int missed) 
	{
  		//variables
		double numericScore = 0;
		numQuestions = questions;
		numMissed = missed;
		
		numPointsEach = 100.0/questions;
		numericScore = 100.0 - (missed * numPointsEach);
		
		setScore(numericScore);	//called from superclass
	}
	
	
  	public double getPointsEach() 
	{
  		return numPointsEach;
  	}

  	public int getNumMissed() 
	{
  		return numMissed;
  	}

}