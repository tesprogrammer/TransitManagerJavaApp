// Author: Tesfa Habebo

package cs254_assignment_w8_m12_personalproject;

import cs254_assignment_MemberClass.Member;

public class SubwayCar extends TransitVehicle {

	private boolean underground;
	
	public SubwayCar(String routeInfo, String vehicleID, boolean repair, boolean theUnderground ) {
		   super(routeInfo, vehicleID, repair);
		   underground = theUnderground;
	}
	
	public boolean getUnderGroundStatus() {
		return underground;
	}
	
	public void setUnderground(boolean newUnderground) {
		underground = newUnderground;
	}
	
	@Override
	public void repair() {
		super.repair();
		if(underground) {
			System.out.println("\t     ***must be removed from tunnel.");
		}
	}
	
	@Override 
	   public String toString() {
		   String text = super.toString() + "\tType: Subway" ;
		   if (underground) {
				text += "\t(Underground)";
			}
			return text;
		}
	
	
}







