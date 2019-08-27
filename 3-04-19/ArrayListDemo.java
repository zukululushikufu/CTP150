/**
Demo array list
Also called linked lists -I think-
File 3

@author Jeffrey Wan
date: 3/4/19
*/

/*	Notes
* 	Array lists require methods to add, remove, and change elements of the array list
*	Default size of an array list is 10. This is called its capacity.
*/

import java.util.ArrayList;	//always import when using an array list

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		//instantiating array list
		ArrayList<String> nameList;	//declaring a String array list reference variable called nameList. Always in the format ArrayList<data type>
		nameList = new ArrayList<String>();	//calling the ArrayList constructor
		
		nameList.add("Khoo");
		nameList.add("Daya");
		nameList.add("Chong");
		
		//displaying array list
		for(int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index + 1) + " Name: " + nameList.get(index));	//nameList.get(index) gets the string stored in the index
		}
		
		//changing the data stored in index 2
		nameList.set(0, "Bryan");	//nameList.set(index, Data)
		System.out.println("Khoo was replaced by Bryan");
		
		//displaying array list
		for(int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index + 1) + " Name: " + nameList.get(index));	//nameList.get(index) gets the string stored in the index
		}
		
		//removing the data in an array list
		nameList.remove(0);
		System.out.println("Removing index 0, Removed Bryan");
		
		//displaying array list
		for(int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index + 1) + " Name: " + nameList.get(index));	//nameList.get(index) gets the string stored in the index
		}
		
		nameList.add("Jeffrey");	//added to the next available index
		System.out.println("Added " + nameList.get(2));
		//displaying array list
		for(int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + (index + 1) + " Name: " + nameList.get(index));	//nameList.get(index) gets the string stored in the index
		}
	}//end main()
	
	
}//end ArrayListDemo
