//This is the parent class 
//make sure no voids on constructors or weird stuff


public class GeometricShape {

  private String color;

  
  public GeometricShape() {
  		color = " ";
  }

  public GeometricShape(String color) {
  		this.color = color;
  }

  public String getColor() {
  		return color;
  }

  public void setColor(String color) {
  	   this.color = color;
  }

  public boolean equals(GeometricShape shape) {
  	   boolean flag = false;
		
		if(this.color.equalsIgnoreCase(shape.color))
		    flag = true;
			 
  return flag;
  }

  public String toString() {
     String str = " ";
	  str+= "\n The color of the shape is: " + color;
  return str;
  }

}