//StringBuilder

public class StringBuild
{
	public static void main(String[] args)
	
	{
	
	StringBuilder city = new StringBuilder("Annapolis,MD"); 
	
	    
		 System.out.println(city);
		 int zip = 12345;
		 String zipcode = "21012";
		 
		// city.append(zip);
		// System.out.println(city);
		 
		 city.append(zipcode);
		 System.out.println(city);
		 
		 city.insert(12, " ");
		 System.out.println(city);
		 
		 city.replace(0, 10, "Baltimore");
		  System.out.println(city);
		  
		  city.delete(0,9);
		  System.out.println(city);
		  

		 

		 
		
		 
		 
		 
		 
		 
	
	
	
	
	}//end main


}//end class