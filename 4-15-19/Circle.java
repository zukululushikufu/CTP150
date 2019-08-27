//This is a child or subclawss of GeometricShape
//It inherits all public methods except constructors

public class Circle extends GeometricShape {

  private double radius;

  public Circle() {
     super(); // refers to superclass will run and must be first 
	  radius = 0; 
  }

  public Circle(double radius, String color) {
  		super(color);  //is there an overloaded constructor in GS?  yes
		this.radius = radius; 
  }

  public void setRadius(double radius) {
    this.radius = radius; 
  }  	
  

  public double getRadius() {
  		return radius;
  }

  public double getCircumference() {
  		  return Math.PI * 2 * radius;
  }
  
  public double getArea() {
     return Math.PI * Math.pow(radius,2);
  }


  public boolean equals(Circle circle) {
  		boolean flag = false;
		if (this.getColor().equalsIgnoreCase(circle.getColor()) &&
		    this.radius == circle.getRadius())
			 flag = true;
  return flag;
  }

  public String toString() {
  		String str = " ";
		str += super.toString();  //explicit call to parent
		str += "\n radius = " + radius;
  return str;
  }

  
}