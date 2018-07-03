import java.util.*;
public class Main {

	private static void namesearch(String Name) {
	ArrayList<String> name =new ArrayList<String>();
	
	 name.add("Bob");
	 name.add("Karen");
	 name.add("Peter");
	 name.add("Emma");
	
	 
          
	if (name.contains(Name)) 
	 {  
			System.out.println(Name);
		}
	else {
		System.out.println("No-one of this name exists");
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//People tony = new People("tony", 21, "job");
			//tony.getAll();
			
			//People kyle = new People ("Kyle", 32, "I.T");
			//System.out.println(kyle.toString());
			
	     namesearch("Emma");
	 
	 
			
	}

}
