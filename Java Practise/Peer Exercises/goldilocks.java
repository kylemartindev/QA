
public class goldilocks {
	
public static void main (String []args) {
	
	
int chairnum [][] = {{30,50},{130,75},{90,60},{150,85},{120,70},{200,200}};	
	
chairs(chairnum);
	
}
	
public static int chairs(int chairnum[][])
{
	int a = 100;
	int b = 80;
	for (int i= 0; i < chairnum.length; i++) {
		 int j =0;
		 if (chairnum [i][j] > a) {
			 int k=1;
			 if (chairnum [i][k]<b) {
				 System.out.println(i+1);
				
			 }
		 }
		
		
	}return a+b;

} 


}
