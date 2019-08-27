/**
Interface is a class  that only has abstract methods that requires overriding if a class implements
this interface

If methods not overridden an error occurs

@author Jeffrey Wan
*/

public interface Relateable 
{
	//abstract methods
  	public boolean isGreater(GradedActivity g);
  	public boolean isLess(GradedActivity g);
  	public boolean isEqual(GradedActivity g);

}