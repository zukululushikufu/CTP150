/**
This program will practice printf
File 3
@author Jeffrey Wan
@date 2/6/19
*/

/*Notes
*	Placeholders:
*	%f = floating point
*	%d = integer
*	%s = string
*/

public class Columns
{
	public static void main(String[] args)
	{
		//declare a variety of doubles
		double num1 = 127.899;
		double num2 = 3465.148;
		double num3 = 3.776;
		double num4 = 264.821;
		double num5 = 88.081;
		double num6 = 1799.999;
		
		String name = "Ringo";
		
		int dogs = 5;
		int cats = 4;
		
		//using printf
		System.out.printf("%.2f\n", num1);	//127.90: rounded up 2 places to the right
		System.out.printf("%,.3f\n", num2);	//3,465.148: puts a comma where necessary and rounds to 3 dp
		System.out.printf("%7.4f\n", num3);	//  3.7660: 7 spaces wide, 4dp
		System.out.printf("%1.5f\n", num4);	//ignores the 1 because we have more digits  than spaces, 5dp
		System.out.printf("%10.6f\n", num5);	//10 places to total 6 to the right
		System.out.printf("%1.2f\n", num6);	//ignores 1 space, rounded to 2dp
		System.out.printf("%s\n", name);	//String denoted with s
		System.out.printf("We have %d dogs and %d cats.", dogs, cats);	//printed integers d for decimal integer printed
	
	}//end main()
}//end class