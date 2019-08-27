/**
Worker SuperClass
Lab 9

@author Jeffrey Wan
*/

public abstract class Worker {

  	//private attributes
	private String name;
	
  	/**
	No-arg constructor for SuperClass Worker
	*/
  	public Worker() 
	{
		this.name = "";
  	}
	
	/**
	Overloaded constructor for SuperClass Worker
	
	@param name The name of the worker
	*/
  	public Worker(String name) 
	{
		this.name = name;
  	}
	
	/**
	Returns private attribute name from SuperClass Worker
	
	@return The name of the worker
	*/
 	public String getName() {
  		return name;
  	}
	
	/**
	Changes the content stored in the private name field for SuperClass Worker
	*/
  	public void setName(String name) {
		this.name = name;
  	}

	/**
	Abstract getPay() method overridden later by subclass getPay() methods that each calculate
	their pay differently
	*/
  	public abstract double getPay();
	
	/**
	Evaluates the equality of each attributes between two Worker objects
	
	returns True if all fields are identical, false if any fields differ
	*/
  	public boolean equals(Worker test) {
  		return this.name.equals(name) ? true : false;
  	}
	
	/**
	Automatically called when the name of the object is used in a System.out.print() statement
	
	@return A String representation of the state of the object
	*/
  	public String toString() {
  		return ("\nName : " + name);
  	}

}