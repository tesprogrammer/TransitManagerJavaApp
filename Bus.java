

public class Bus extends TransitVehicle {
	
   private int MPG;
   
   public Bus(String routeInfo, String vehicleID, boolean repair, int milesPerGallon) {
	   super(routeInfo, vehicleID, repair);
	   MPG = milesPerGallon;
   }
   
   public String getMPG() {
	   return "Bus " + vehicleID + " is " + MPG + "MPG";
   }
   
   public void setMPG(int milesPerGallon) {
	   if (milesPerGallon > 0) {
		   MPG = milesPerGallon;
	   } else {
		   System.out.print("Your MPG entry is invalid. Please try again.");
	   }
   }
   
   @Override 
   public String toString() {
	   String text = super.toString() + "\tType: Bus" + "\tMPG: " + MPG;
	   return text;
	}
   
}