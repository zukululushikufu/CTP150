//subclass of Geometric  Shape

public class Rectangle extends GeometricShape {

  private double length;

  private double width;

  public Rectangle() {
  		super();  //refers to parent constructor
		length = 0;
		width = 0; 
  }

  public Rectangle(double length, double width,String color) {
  		super(color);
		this.length = length;
		this.width = width;
  
  }

  public double getLength() {
  		return length;
  }

  public double getWidth() {
  		return width;
  }

  public void setLength(double length) {
  			this.length = length;

  }

  public void setWidth(double width) {
  		this.width = width;

  }

  public double getPerimeter() {
  		return 2* length + 2 * width;
  }
  
  public double getArea() {
  		return length * width;
  }


  public boolean equals(Rectangle rectangle) {
  		boolean flag = false;
		if(this.getColor().equalsIgnoreCase(rectangle.getColor()) &&
		   this.length == rectangle.getLength() &&
			this.width == rectangle.getWidth())
			flag = true;
  return flag;
  }

  public String toString() {
  		String str = " ";
		str += super.toString(); 
		str += "\n The length is: " + length;
		str += "\n The width is: " + width;
 return str;
  }

  
}