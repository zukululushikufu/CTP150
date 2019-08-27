/**
Selection sort example
File 1

@author Jeffrey Wan
date: 3/6/19
*/

public class SelectionSort
{
	public static void main(String[] args)
	{
		//variables
		int index;
		int startScan;
		int minValue;
		int minIndex;
		
		int[] values = {5, 7, 2, 8, 0, 12, 8};
		
		//display unsorted array
		System.out.println("Unsorted Array");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");
		
		System.out.println();
		
		//initialize
		for(startScan = 0; startScan < (values.length - 1); startScan++)
		{
			//initialize minValue and minIndex to the first element and first index
			minIndex = startScan;
			minValue = values[startScan];
			
			//comparison for loop
			for(index = startScan + 1; index < values.length; index++)
			{
				//compares scanned value to the minimum value
				if (values[index] < minValue)
				{
					minValue = values[index];
					minIndex = index;
				}
			}
			
			//assigns the scanned value to the element at the minimum index
			values[minIndex] = values[startScan];
			//assigns the scanned index to the minimum value
			values[startScan] = minValue;
			
			//those two lines up there essentially swap the position of the selected element with the minimum index
		}//end sort
		
		//print sorted array
		System.out.println("Sorted Array");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");
	
	}//end main()
}//end SelectionSort
