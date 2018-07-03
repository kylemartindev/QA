
public class Car extends Vehicle {
   
	private int doors;
	private int wheeldrive;
	

public Car( int ID, String VehicleType, String Make, String Model, int enginesize, int emissions, int year,int doors, int wheeldrive) {
	super(ID, VehicleType, Make,Model, enginesize, emissions, year);
	    
	this.doors = doors;
	this.wheeldrive = wheeldrive;
	
	}

public int getDoors() {
	return doors;
	
}
public int getWheeldrive() {
	return wheeldrive;
	
}

public String toString() {
	
	return "\n" +"Car is: " + "ID: " + this.getVehicleID() + " " + "Type " + this.getVehicleType() + " " + "Make :" + this.getMake() + 
			" " + "Model" + this.getModel() + " " + "Engine Size" + this.getEnginesize() + " "  + "Emissions: " + this.getEmissions() + 
			" " + "Year " + this.getYear() + " "+ "Doors: " + this.getDoors() + " "+ this.getWheeldrive() +"Wheeldrive";
	 
}




}


