import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StaplerDriver {
	public static void main(String [] args) throws IOException {
		Stapler [] staplers = new Stapler[3];
		readAllStaplers(staplers);
		displayAllStaplers(staplers);
		displayStaplerByColor(staplers);
		addStaples(staplers);
		
	}//end main()
	
	public static void addStaples(Stapler []staplers){
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < staplers.length ; i++){
			System.out.print(i + "\t");
			System.out.println(staplers[i].getBrand() + "\t" +
									 staplers[i].getModel() + "\t" +
									 staplers[i].getNumStaples());
		}//end for
		System.out.println("which index to add staples?");
		int index = scan.nextInt();
		System.out.println("How many staples to add?");
		int num = scan.nextInt();
		staplers[index].addStaples(num);
		System.out.println(staplers[index]);		
		
	}//end addStaples()
	
	public static void displayStaplerByColor(Stapler []staplers){
		Scanner scan = new Scanner(System.in);
		String color = "";
		System.out.println("Which color stapler?");
		color = scan.nextLine();
		boolean found = false;
		for (Stapler s : staplers)
			if (s.getColor().equalsIgnoreCase(color)){
				System.out.println(s);
				System.out.println("--------------------");
				found = true;
			}//end if
			
		if (!found)
			System.out.println("No " + color + " staplers found");
	}//end displayByColor()
		
		

	public static void displayAllStaplers(Stapler [] s) {
   
   //Printing the data two separate ways. 
		for (int i = 0; i < s.length ; i++){
			System.out.println(s[i]);
			System.out.println("-------------------------");
		}//end for
		
		for (Stapler m : s){   //m is each Stapler in the entire array
			System.out.println(m);
			System.out.println("-------------------------");
		}
	}//end displayAllStaplers()
	
	
/*/This used the tokenizer
	public static void readAllStaplers(Stapler [] s) throws IOException{
		//File infile = new File("staplerData.csv");
      File infile = new File("staplefile");
		Scanner scan = new Scanner (infile);
		String str = "";
		for (int i = 0; i < s.length; i++){
			str = scan.nextLine();
			StringTokenizer st = new StringTokenizer(str, ",");
			
			String [] tokens = str.split(",");
			
			
			String brand = st.nextToken();
			String model = st.nextToken();
			String color = st.nextToken();
			double price = Double.parseDouble(st.nextToken());
			int numStaples = Integer.parseInt(st.nextToken());
			s[i] = new Stapler(brand, model, color, price, numStaples);
		}//end for
		
		scan.close();
	}//end readAllStaplers()
   */
   public static void readAllStaplers(Stapler [] s) throws IOException{
		File infile = new File("stapletokens");
		Scanner scan = new Scanner (infile);
		String str = "";
      //int i =0;
      
		//read whole file into string
		str = scan.nextLine();
		
      //while(scan.hasNext()) {
					
		for(int index = 0; index < s.length; index++)
		{	
			
			String[] token = str.split(",");
			
			String brand = token[0];
			String model = token[1];
			String color = token[2];
			double price = Double.parseDouble(token[3]);
			int numStaples = Integer.parseInt(token[4]);
			s[index] = new Stapler(brand, model, color, price, numStaples);
			
			
			if(scan.hasNext())
				str = scan.nextLine();
			
		}//end for
		
		scan.close();
	}//end readAllStaplers(
	
}//end class


/*	Note
*	Each token is separated by a comma
*	Example: Swingline = token1, 747 = token2, ect..
*/