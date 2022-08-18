
public class TransitVehicle {
	public String routeInfo;
	public String vehicleID;
	public boolean repair;
	
   public TransitVehicle(String route, String vehID, boolean repairStatus) {
	   routeInfo = route;
	   vehicleID = vehID;
	   repair = repairStatus;
	   
   }
   
   public void setVehID(String vehID) {
	   vehicleID = vehID;
   }
   
   public void setRoute(String route) {
	   routeInfo = route;
   }
   
   public String getVehID() {
		return vehicleID;
  }
   
   public String getPrintSchedule() {
		return routeInfo;
   }
   
   public String printSchedule() {
		return "Route: " + routeInfo + "\t scheduled for vehicle " + vehicleID;
   }
   
   public void repair() {
	   if(repair) {
		   System.out.print("Repairs needed for vehicle " + vehicleID + "\n");
	   }
   }

   public String toString() {
	return "vehicleID: " + vehicleID
    		  + "\tRoute: " + routeInfo;
   }
}

