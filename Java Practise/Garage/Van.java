
public class Van extends Vehicle {

private int wheelbasetype;
  private int maxweight;

  	
  public Van(int ID, String VehicleType, String Make, String Model, int enginesize, int emissions, int year, int wheelbasetype, int maxweight) {
		super(ID, VehicleType, Make, Model, enginesize, emissions, year);
		this.wheelbasetype = wheelbasetype;
		this.maxweight = maxweight;
	}
  public int getWheelbasetype() {
		return wheelbasetype;
		
	}
  public int getMaxweight() {
		return maxweight;
		
	}

	public String toString() {
		
		return "\n"+"Van is: " + "ID: " + this.getVehicleID() + " " + "Type: " + this.getVehicleType() + " " + "Make :" + this.getMake() + 
				" " + "Model: " + this.getModel() + " " + "Engine Size: " + this.getEnginesize() + " "  + "Emissions: " + this.getEmissions() + 
				" " + "Year: " + this.getYear() + " "+ "Wheelbase: " + this.getWheelbasetype() + " " + "MaxWeight: " + this.getMaxweight();
		 
	}










}








