import java.util.Scanner;
public class dogShow {
	
private static void number() {
	
System.out.print("Enter your dogs postiton:   ");
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();


 for (int i = 1; i <101; i++) {
	  if(i==num1) continue;
	  
	    if (i>10 && i<14) {
		 System.out.print(i +"th," );
	  }
	    
	    else if (i % 10 ==1 ) {
		System.out.print(i + "st, ");  
	  }
	 
	  else if (i % 10 ==2 ) {
			System.out.print(i + "nd, ");  
	  }	
	    
	  else if (i % 10 ==3 ) {
			System.out.print(i + "rd, ");  
	  }
	  
	  else 	{
	 System.out.print(i +"th," + " " );
	  }  
	    
 } 
 
}

	
public static void main (String [] args) {
	
	
number();

	
	
}
	
	
}
