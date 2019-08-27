public class PassFailActivity extends GradedActivity 
{
	//private attributes
  	private double minPassingScore;

	
  	public PassFailActivity(double mps) 
	{
		minPassingScore = mps;
  	}
	
	/**
	The getGrade method returns a letter grade determined from the score field
	The method overrides the superclass method
	
	@return the letter grade
	*/
	@Override
  	public char getGrade() 
	{
		char letterGrade = ' ';
		
		if(super.getScore() >= minPassingScore)
			letterGrade = 'P';
		else
			letterGrade = 'F';
			
  		return letterGrade;
  	}

}