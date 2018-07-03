
public class HelloWorld {
	
private static void method1()
{System.out.println("Hello World");
	
}
private static void method2(String name)
{
	System.out.println("Hello World" + name);
	
}

private static int method3(int a, int b) { 
	int result = 0;
	if (a==0)
	{
	result = b;
	} else if (b==0) {
		result = a;
	}
	else if (a>b && b>0)
	{
	result = a+b;	
	}
	return result;
}	


	

	
	public static void main (String [] args){
		

	
	
	System.out.println(method3(4,2));
	System.out.println(method3(4,0));	 
			      
	
	}
}