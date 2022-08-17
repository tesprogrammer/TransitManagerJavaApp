package cs254_assignment_w8_m12_personalproject;

import java.util.ArrayList;

import cs254_assignment_w8_m12_Solution.Bus;
import cs254_assignment_w8_m12_Solution.SubwayCar;
import cs254_assignment_w8_m12_Solution.TransitVehicle;
import java.util.Scanner;

public class TransitManager {
   public static void main(String[] args) {
	   ArrayList<TransitVehicle> vehicleList = new ArrayList<TransitVehicle>();
	   Scanner scan = new Scanner(System.in);
	   String selection = "1";
	   String vehicleID = "";
	   int milesPerGallon;
	   String routeInfo = "";
	   boolean underground;
	   boolean repair;
      
      System.out.println("Welcome to the Transit Manager!");
      System.out.println("\nThis system allows you to add a vehicle,"
      		+ "\nsee a list of all vehicles or ones that need repair."
      		+ "\n");
	  
      while (!selection.contains("0") | !selection.contains("0")) {
    	  System.out.println("What would you like to do?\n"
  	      		+ "1) Add a bus,"
  	      		+ "\n2) Add a subway Car,"
  	        	+ "\n3) View vehicle roster, "
  	        	+ "\n4) View schedule, "
  	        	+ "\n5) View repair manifest."
  	        	+ "\n0) Enter zero to exit."
  	        	+ "\n");
          selection = scan.nextLine();
    	  
          if (selection.contains("1")) {
        	  System.out.println("Enter vehicle ID");
          	  vehicleID = scan.nextLine();
        	  System.out.println("Enter Route Info");
        	  routeInfo = scan.nextLine();
          	  System.out.println("Enter miles per gallon");
          	  milesPerGallon = Integer.parseInt(scan.nextLine());
          	  System.out.println("Does it need repair? true/false");
      	      repair = scan.nextBoolean();
        	  vehicleList.add(new Bus(routeInfo, vehicleID, repair, milesPerGallon));
        	  System.out.println("Anything else? yes/no");
        	  selection = scan.nextLine();
          } else if (selection.contains("2")) {
        	  System.out.println("Enter vehicle ID");
          	  vehicleID = scan.nextLine();
        	  System.out.println("Enter Route Info");
        	  routeInfo = scan.nextLine();
        	  System.out.println("Does it go underground? true/false");
        	  underground = scan.nextBoolean();
        	  System.out.println("Does it need repair? true/false");
        	  repair = scan.nextBoolean();
        	  vehicleList.add(new SubwayCar(routeInfo, vehicleID, underground, repair));
        	  System.out.println("Anything else? yes/no");
        	  selection = scan.nextLine();
          } else if (selection.contains("3")) {
        	  for(TransitVehicle vehicle : vehicleList) {
                  System.out.println(vehicle);
              }
              System.out.println();
              System.out.println("Anything else? yes/no");
        	  selection = scan.nextLine();
          } else if (selection.contains("4")) {
        	  for(TransitVehicle vehicle : vehicleList) {
        		  System.out.println(vehicle.printSchedule());
              }
        	  System.out.println("Anything else? yes/no");
        	  selection = scan.nextLine();
          } else if (selection.contains("5")) {
        	  System.out.println();
              for(TransitVehicle vehicle : vehicleList) {
                  vehicle.repair();
              }
              System.out.println("Anything else? yes/no");
        	  selection = scan.nextLine();
          }
    	  
      }
   }
}


