/**
This will demo 2-D arrays
File 2

@author Jeffrey Wan
date: 3/4/19
*/

public class Pass2Darray1
{
	public static void main(String[] args)
	{
		// numbers[ROW][COL]

		int[][] numbers = {	{1, 2, 3, 4},
									{5, 6 ,7 ,8},
									{9, 10, 11, 12}
								};
								
		//display all elements
		showArray(numbers);
		
		//Show sum of arrays
		System.out.println("The sum of the values of the array is: " + sumArray(numbers));
		
		//show sum of rows
		System.out.println("Displaying the sum for each row: ");
		sumRows(numbers);
			
		//show sum of cols
		System.out.println("Displaying the sum for each column: ");
		sumCols(numbers);
	}//end main()
	
	/**
	Displays all the elements of the array passed into it
	
	@param array A 2 dimensional array of integers
	*/
	public static void showArray(int[][] array)
	{
		/*
			int rowSize = array.length				3
			int columSize = array[0].length		4
		*/
		
		System.out.println("Row size: " + array.length);
		System.out.println("Column size: " + array[0].length);
		
		for(int row = 0; row < array.length /*row size*/; row++)
		{
			for(int col = 0; col < array[row].length /*column size*/; col++)
			{
				System.out.print(array[row][col] + " ");
			}
			
			//new line
			System.out.println();
		}
	}//end showArray(int[][])
	
	/**
	Adds up all of the elements from the index 0 to the last index
	
	@param array A 2 dimensional array of integers
	@return The sum of all the integers in the array
	*/
	public static int sumArray(int[][] array)
	{
		//declarations
		int total = 0;
		
		//accumulating
		for(int row = 0; row < array.length; row++)
		{
			for(int col = 0; col < array[row].length; col++)
			{
				total += array[row][col];
			}
		}
		
		return total;
	}//end SumArray(int[][]) returns an int
	
	/**
	Displays the sum for each row
	
	@param array A 2 dimensional array of integers
	*/
	public static void sumRows(int[][] array)
	{
		//variable
		int total;
		
		for(int row = 0; row < array.length; row++)
		{
			//initialize total to 0
			total = 0;
			
			for(int col = 0; col < array[row].length; col++)
			{
				total += array[row][col];
			}
			
			//display
			System.out.println("Sum for Row " + row + " is " + total);
		}
	}//end sumRows(int[][])
	
	/**
	Displays the sum for each column
	
	@param array A 2 dimensional array of integers
	*/
	public static void sumCols(int[][] array)
	{
		//variable
		int total;
		
		for(int col = 0; col < array[0].length; col++)
		{
			//initialize
			total = 0;
			for(int row = 0; row < array.length; row++)
			{
				total += array[row][col];
			}//end row iterations
			
			//display
			System.out.println("Sum for Col " + col + " is " + total);
			
		}//end column iterations
		
	}//end sumCols(int[][])

}//end Pass2Darray1