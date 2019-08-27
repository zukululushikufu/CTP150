public class PassFailExam extends GradedActivity {
	
	//private attributes
  	private int numQuestions;
  	private double pointsEach;
  	private int numMissed;
	
	
  	public PassFailExam(int questions, int numMissed, double minPassing) 
	{
		//local variable
		double numericScore;
		
		//set attributes
		numQuestions = questions;
		numMissed = numMissed;
		
		//calculate points and score
		pointsEach = 100.0/questions;
		numericScore = 100.0 - (numMissed * pointsEach);
		
		setScore(numericScore);
	}

  	public double getPointsEach() {
  		return pointsEach;
  	}

  	public int getNumMissed() {
  		return numMissed;
  	}

}