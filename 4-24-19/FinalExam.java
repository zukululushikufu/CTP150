public class FinalExam extends GradedActivity implements Relateable {

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
	
	/**
	The isGreater() method determines whether the calling object is greater
	than the argument object
	
	@return true if calling object's score is greater than argument object
	*/
  	public boolean isGreater(GradedActivity g) 
	{		
  		return (this.getScore() > g.getScore()) ? true : false;
  	}
	
  	public boolean isLess(GradedActivity g) 
	{
  		return (this.getScore() < g.getScore()) ? true : false;
  	}
	
  	public boolean isEqual(GradedActivity g) 
	{
  		return (this.getScore() == g.getScore()) ? true : false;
  	}

}