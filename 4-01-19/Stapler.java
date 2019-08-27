public class Stapler {

   private String brand;
   private String model;
   private String color;
   private double price;
   private int numStaples;
	
	
   public Stapler() {
		brand = "";
		model = "";
		color = "";
		price = numStaples = 0;
   }

   public Stapler(String brand, String model, String color, double price, int numStaples) {
 		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.numStaples = numStaples;  
	}

   public Stapler(Stapler copy) {
		this.brand = copy.brand;
		this.model = copy.model;
		this.color = copy.color;
		this.price = copy.price;
		this.numStaples = copy.numStaples;		
   }

   public boolean equals(Stapler test) {
		boolean same = false;
		if (brand.equalsIgnoreCase(test.brand) &&
			 model.equalsIgnoreCase(test.model) &&
			 color.equalsIgnoreCase(test.color) &&
			 price == test.price &&
			 numStaples == test.numStaples)
			 
			 same = true;
      return same;
   }

   public void addStaples(int howMany) {
		numStaples += howMany;   //check to see if we can add howMany
   }

	public String getColor(){
		return color;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getNumStaples(){
		return numStaples;
	}
	
   public String toString() {
		String str = "";
		str += "Stapler brand : " + brand;
		str += "\nStapler model : " + model;
		str += "\nStapler color : " + color;
		str += "\nStapler price : " + String.format("$%.2f", price);
		str += "\nCurrent number of staples : " + numStaples;
		
		
      return str;
   }

}