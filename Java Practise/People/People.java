import java.util.*;
public class People {

	private static String Name;
	private static int Age;
	private static String JobTitle;
	
	public People (String Name, int age, String Job) {
		this.Name = Name;
		this.Age = age;
		this.JobTitle = Job;
		
	 	
		
		
	}
	public void getAll() {
		System.out.print(this.Name + this.Age + this.JobTitle);
	}
	
 public String getName() {
 return this.Name;}
 
 public int getAge() {
 return this.Age;}
 
 public String getJobTitle() {
 return this.JobTitle;}
 
public String toString() {

return "Name: " + Name + " " + "Age: " + Age + " " + "Job: " + JobTitle;
	

}


}
