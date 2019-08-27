/**
Worker Driver class
Lab 9

@author Jeffrey Wan
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class WorkerDriver 
{
   public static void main(String[] args) throws IOException 
   {
      //instantiations
      ArrayList<Worker> workerList = new ArrayList<Worker>();
      Scanner keyboard = new Scanner(System.in);
      int option = 0;
      
      //fill arrayList
      createWorkerArrayList(workerList);
      
      do
      {
         //menu
         System.out.println("\nThis program displays a variety of worker information. Please select one of the following options: ");
         System.out.println("1.) Display all workers " +
                            "\n2.) Search for a particular worker by last name " +
                            "\n3.) Display all workers who earn more than your specified amount " +
                            "\n4.) Display all workers of a chosen type" +
                            "\n5.) Exit");
         System.out.print("Choose an option: ");
         option = keyboard.nextInt();
         keyboard.nextLine();
                
         //menu options                   
         switch(option)
         {
            case 1:
               displayWorkerArrayList(workerList);
               break;
            case 2:
               System.out.print("Enter the surname of the person you are searching for: ");
               String surname = keyboard.nextLine();
               searchByLastName(workerList, surname);
               break;
            case 3:         
               System.out.print("\nEnter your amount to view those who earn more than the specified amount: ");
               double salary = keyboard.nextDouble();
               searchByHigherSalary(workerList, salary);
               break;
            case 4:
               System.out.println();
               displayWorkerByType(workerList);
               break;
            case 5:
               System.out.println("Closing program. . .");
               System.exit(0);
               break;
            default:
               System.out.println("Invalid option input. Please enter a number from 1 - 4");
               break;
         }
      }while(option != 5);
   }//end main()

   //reads a csv file, tokenizes the data, and fills the Worker ArrayList
   public static void createWorkerArrayList(ArrayList<Worker> list) throws IOException 
   {
      //instantiations and variables
      File workerInfo = new File("employees.csv");
      Scanner inputFile = new Scanner(workerInfo);
      
      String tokens[];
      String line = "";
      String name = "";
      
      char workerType = ' ';
      double hoursWorked = 0;
      double payRate = 0;
      double yearlyPay = 0;
      double salesAmount = 0;
      
      //check file existence
      if(!workerInfo.exists())
      {
         System.out.println("File does no exist. Closing program");
         System.exit(0);
      }
      
      //read file and tokenize
      while(inputFile.hasNextLine())
      {
         line = inputFile.nextLine();
         tokens = line.split(",");
         
         workerType = tokens[0].charAt(0);
         
         //allocating tokens to correct worker types
         switch(workerType)
         {
            case 'h':   //hourly worker
               name = tokens[1];
               hoursWorked = Double.parseDouble(tokens[2]);
               payRate = Double.parseDouble(tokens[3]);
               
               list.add(new HourlyWorker(name, hoursWorked, payRate));
               break;
            case 's':   //salary worker
               name = tokens[1];
               yearlyPay = Double.parseDouble(tokens[2]);
               
               list.add(new SalaryWorker(name, yearlyPay));
               break;
            case 'c':   //sales worker
               name = tokens[1];
               salesAmount = Double.parseDouble(tokens[2]);
               
               list.add(new SalesWorker(name, salesAmount));
               break;
            default:
               System.out.println("Could not identify worker type.");
               break;
         }
      }//end file reading and tokenizing
      
      inputFile.close();
   }//end createWorkerArayList()
   
   //displays all workers regardless of type
   public static void displayWorkerArrayList(ArrayList<Worker> list) 
   {
      for(Worker person : list)
         System.out.println(person);
   }

   //searches by lastName
   public static void searchByLastName(ArrayList<Worker> list, String name) 
   {
      //variables
      String names[];
      String surnames[] = new String[list.size()];
      boolean found = false;
      
      //populate surname array
      for(int index = 0; index < list.size(); index++)
      {
         names = list.get(index).getName().split(" ");
         surnames[index] = names[1];
      }
      
      //search by last name and print if last name found
      for(int i = 0; i < surnames.length; i++)
      {
         if(surnames[i].equalsIgnoreCase(name))
         {
            System.out.println(list.get(i));
            found = true;
         }
      }
      
      //error message if name not found
      if(found == false)
      {
         System.out.println("Error: No worker with last name - " + name);
      }
   }
   
   //searches by higher salary
   public static void searchByHigherSalary(ArrayList<Worker> list, double yourSalary) 
   {
      //error checking
      if (yourSalary < 0)
      {
         System.out.println("Invalid input. Please enter a number greater than 0.");
         return;
      }
      
      //search
      for(Worker person : list)
      {
         if(person.getPay() > yourSalary)
            System.out.println(person);
      }
   
   }

   //displays appropriate menu
   public static void displayWorkerByType(ArrayList<Worker> list) 
   {
      //instantiations and variables
      Scanner keyboard = new Scanner(System.in);
      int option = 0;
      
      //prompts
      System.out.println("To view information a certain type of worker please select one of the following options: ");
      System.out.println("1.) Hourly workers " +
                         "\n2.) Salaried workers " +
                         "\n3.) Sales workers " +
                         "\n4.) Exit and close program");
      
      System.out.print("Select an option: ");
      option = keyboard.nextInt();
      
      //menu
      switch(option)
      {
         case 1:
            for(Worker person: list)
            {
               if(person instanceof HourlyWorker)
                  System.out.println(person);
            }
            break;
         case 2:
            for(Worker person: list)
            {
               if(person instanceof SalaryWorker)
                  System.out.println(person);
            }
            break;
         case 3:
            for(Worker person: list)
            {
               if(person instanceof SalesWorker)
                  System.out.println(person);
            }
            break;
         case 4:
            System.out.println("Closing program. . .");
            System.exit(0);
            break;
         default: 
            System.out.println("Invalid option input. Please enter a number from 1 - 4");
      }
   }
}