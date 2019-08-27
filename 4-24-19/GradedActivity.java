
public class GradedActivity
{

  //priuvate attribute
  	private double score;
	
 	/**
	No arg constructor
	
	@param score The score obtained by the student
	*/
  	public void setScore(double score) 
	{
  		this.score = score;
  	}	
	
	/**
	The getScore method ret urns the score field
	
	@return The value stored in score
	*/
  	public double getScore() {
  		return score;
  	}
	
	/**
	The getGrade method returns a letter grade
	determined from the score field
	
	@return The letter grade
	*/
  	public char getGrade() 
	{
  		//variables
		char letterGrade = ' ';
		
		if(score >= 90)
			letterGrade = 'A';
		else if (score >= 80)
			letterGrade = 'B';
		else if (score >= 70)
			letterGrade = 'C';
		else if (score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';	
		
		
		return letterGrade;
  	}

}