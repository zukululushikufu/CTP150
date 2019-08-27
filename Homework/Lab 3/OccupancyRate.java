/**
Lab 3 - Question 1
@author Jeffrey Wan
*/

/*	Steps
*	Occupancy rate = Number of rooms occupied/ Total number of rooms
*
* 	1) Ask for the number of floors in the hotel
*	2) Loop to iterate for each floor once.
*	   For each iteration ask the number of rooms on each floor and how many are occupied
*	3) After iterations complete display total number of rooms, number of rooms occupied
*		and the occupancy rate for the hotel. Occupancy rate displayed as percentage
*	4) Do not accept input for number of floors <1, number of rooms on each floor <10
*		number of rooms occupied > total rooms. Prompt to re-enter value if invalid input.
*/
import java.util.Scanner;

public class OccupancyRate
{
   public static void main(String[] args)
   {
      //variables
      int numFloors = 0;
      int totalRooms = 0;
      int totalRoomsOccupied = 0;
      double occupancyRate = 0;
      
      Scanner input = new Scanner(System.in);
      
      //intro & getting number of rooms
      System.out.println("This program gets calculates the occupancy rate based on the" +
                         " number of rooms occupied divided by the total number of rooms.");
      System.out.println("Enter the number of floors in your hotel: ");
      numFloors = input.nextInt();
      
      //error check numFloors
      while (numFloors < 1)
      {
         System.out.println("Number of floors cannot be less than 0. Please enter a valid number: ");
         numFloors = input.nextInt();
      }
      
      //getting the number of rooms on each floor and how many rooms are occupied
      for (int currentFloor = 1; currentFloor <= numFloors; currentFloor++)
      {
         //variables
         int roomsOnCurrentFloor = 0;
         int roomsOccupiedOnCurrentFloor = 0;
         
         //getting rooms on current floor and rooms occupied
         System.out.println("Enter the number of rooms on floor " + currentFloor + ": ");
         roomsOnCurrentFloor = input.nextInt();
         
         //error check acceptable number of rooms per floor
         while (roomsOnCurrentFloor < 10)
         {
            System.out.println("Number of rooms per floor cannot be less than 10. Enter a valid number: ");
            roomsOnCurrentFloor = input.nextInt();
         }
         
         System.out.println("Enter the number of rooms occupied on floor " + currentFloor + ": ");
         roomsOccupiedOnCurrentFloor = input.nextInt();
         
         //error checking for rooms occupied vs total rooms on that floor
         while (roomsOccupiedOnCurrentFloor > roomsOnCurrentFloor)
         {
            System.out.println("Number of rooms occupied on the current floor is greater than" +
                                 " the number of rooms available on that floor. Please enter again: ");
           
            System.out.println("Enter the number of rooms occupied on floor " + currentFloor + ": ");
            roomsOccupiedOnCurrentFloor = input.nextInt();  
         }
         
         //if error checking passed accumulate total
         totalRooms += roomsOnCurrentFloor;
         totalRoomsOccupied += roomsOccupiedOnCurrentFloor;
      }
      
      //calculate occupancy rate
      occupancyRate = (double) totalRoomsOccupied / totalRooms;
      
      //display results
      System.out.println("Total number of rooms: " + totalRooms);
      System.out.println("The number of rooms occupied: " + totalRoomsOccupied);
      System.out.printf("Occupancy rate: %.2f%%\n", occupancyRate * 100);
   }//end main()
}//end OccupancyRate
