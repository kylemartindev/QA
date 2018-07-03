
public class Vehicle extends garage {
	
	private  int VehicleID;
	private String VehicleType;
	private String Make;
	private String Model;
	private int enginesize;
	private int emmissions;
	private int year;
	
	
 
public Vehicle(int ID, String VehicleType, String Make, String Model, int enginesize, int emissions, int year) {
	this.VehicleID = ID;
	this.VehicleType = VehicleType;
	this.Make = Make;
	this.Model = Model;
	this.enginesize = enginesize; 
	this.emmissions = emissions;
	this.year = year;
	
	
}	

public int getVehicleID () {
	 return this.VehicleID;
	 }
public String getVehicleType() {
 return VehicleType;
 }

public String getMake () {
	 return Make;
	 }
public String getModel () {
	 return Model;
	 }
public int getEnginesize () {
	 return enginesize;
	 }
public int getEmissions () {
	 return emmissions;
	 }
public int getYear () {
	 return year;
}


public String toString() {
	
	if (VehicleType == "Car") {
		
	
	}return "car";
	
	
	 
}




}
