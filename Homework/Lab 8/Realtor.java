/**
Realtor Class
Lab 8

@author Jeffrey Wan
*/

public class Realtor {
   
   //private attributes
   private String name;
   private String companyName;

   //constructors
   public Realtor() 
   {
      name = "";
      companyName = "";
   }

   public Realtor(String name, String companyName) 
   {
      this.name = name;
      this.companyName = companyName;
   }

   public Realtor(Realtor copy) 
   {
      this.name = copy.name;
      this.companyName = copy.companyName;
   }
   
   //getters
   public String getName() 
   {
      return name;
   }

   public String getCompanyName() 
   {
      return companyName;
   }

   //setters
   public void setName(String name) 
   {
      this.name = name;
   }

   public void setCompanyName(String companyName) 
   {
      this.companyName = companyName;
   }
   
   //tests equality between two objects
   public boolean equals(Realtor test) 
   {
      //if object1 attributes == object2 attributes return true, else false
      return (this.name.equals(test.name) &&  this.companyName.equals(test.companyName)) ? true : false;
   }

   public String toString() 
   {
      String str = "";
      
      str += ("Realtor Name : " + this.name);
      str += ("\nCompany Name: " + this.companyName);
      
      return str;
   }

}