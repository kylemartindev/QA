import java.util.*;
public class garage {

//garage run = new garage ();



ArrayList<Vehicle> storage;

garage() {
	storage = new ArrayList<Vehicle>();
}

	

public void addVehicle() 
{

	
	Car Car1 = new Car (1,"car","Ford","Fiesta",2002,120,2005,5,4);
	storage.add(Car1);
	Motorbike Motor1 = new Motorbike(2,"Motorbike","Honda","z",225,500,2012,"scooter");
	storage.add(Motor1);
	Van Van1 = new Van(3,"Van","Mercedes","Sprinter",225,500,2012,4,1200);
	storage.add(Van1);
	
	System.out.println(storage);
}

public void removeVehicle(int ID)
{
	System.out.println(storage);
	for (int i =0; i <storage.size(); i++) 
	
	if (i == ID) {
	 storage.remove(i);	
	 System.out.println(storage);
	}
     
}
	
public double fixVehicle() 
{   
	double v = 50;
	
	
	double c = 30;
	
	
	double m = 20;
	
	
	
	
	for (Vehicle items:storage) {
	  if (items instanceof Van) {
	  
		return v;
	  }
		
		 
			 if (items instanceof Car){
			  
				return c;	}
				
				 {
					  if (items instanceof Car); {
					  
						return m;	
						
				}
	
	
	
}
				 
	}return 0;
	}
	
	
	
	


public void empty() {
	storage.removeAll(storage);
	System.out.println(storage);
}
}	
	

