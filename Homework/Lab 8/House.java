/**
House class
Aggregation with Realtor
Lab 8

@author Jeffrey Wan
*/
public class House {

   //private attributes
   private Realtor realtor;
   private String city;
   private String state;
   private double price;

   //constructors   
   public House() 
   {
      realtor = new Realtor();
      city = "";
      state = "";
      price = 0.0;
   }

   public House(Realtor realtor, String city, String state, double price) 
   {
      this.realtor = new Realtor(realtor);
      this.city = city;
      this.state = state;
      this.price = price;
   }
   
   //copy constructor
   public House(House copy) 
   {
      this.realtor = new Realtor(copy.realtor);
      this.city = copy.city;
      this.state = copy.state;
      this.price = copy.price;
   }

   //getters
   public Realtor getRealtor() 
   {
      return new Realtor(realtor);
   }

   public String getCity() 
   {
      return city;
   }

   public String getState() 
   {
      return state;
   }

   public double getPrice() 
   {
      return price;
   }
   
   //setters
   public void setRealtor(Realtor realtor) 
   {
      this.realtor = new Realtor(realtor);
   }

   public void setCity(String city) 
   {
      this.city = city;
   }

   public void setState(String state) 
   {
      this.state = state;
   }

   public void setPrice(double price) 
   {
      this.price = price;
   }

   //test equality betwween the two objects
   public boolean equals(House test) 
   {
      boolean same = false;
      
      if(this.realtor.equals(test.realtor) &&
         this.city.equals(test.city) &&
         this.state.equals(test.state) &&
         this.price == test.price)
            same = true;
      
      return same;
   }

   public String toString() 
   {
      String str = "";
      
      str += (realtor + "\n");
      str += ("City: " + city);
      str += ("\nState: " + state);
      str += ("\nPrice : $" + String.format("%.2f\n", price));
      
      return str;
   }

   public void reducePrice(double percentage) 
   {
      this.price = this.price * (1 - percentage);
   }

}
