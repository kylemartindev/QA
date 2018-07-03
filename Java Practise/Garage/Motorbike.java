
public class Motorbike extends Vehicle {


private String cctype;
		
   public Motorbike(int ID, String VehicleType, String Make, String Model, int enginesize, int emissions, int year, String cctype) {
		super(ID, VehicleType, Make, Model, enginesize, emissions, year);
          
		this.cctype = cctype; 
		
		
	}
   
   public String getCctype() {
		return cctype;
		
	}
	

	public String toString() {
		
		return "\n"+"Motorbike is: " + "ID: " + this.getVehicleID() + " " + "Type: " + this.getVehicleType() + " " + "Make :" + this.getMake() + 
				" " + "Model: " + this.getModel() + " " + "Engine Size: " + this.getEnginesize() + " "  + "Emissions: " + this.getEmissions() + 
				" " + "Year: " + this.getYear() + " "+ "CC Type: " + this.getCctype();
		 
	}
 
   
   
}
