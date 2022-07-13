import java.util.*;
public class Employee {
   static int id;
   static String fname;
   static String lname;
   static String city;
   static String state;
    public Employee(int id,String fname,String lname,String city,String state) {
    	this.id=id;
    	this.fname=fname;
    	this.lname=lname;
    	this.city=city;
    	this.state=state;
    	
    }
    
    public static void fetch() {               //static method, does not require object
    	System.out.println("Employee details are :"+"\n"+" "+id+" "+"\n"+" "+fname+"\n"+" "+lname+"\n"+" "+city+"\n"+" "+state);       
    }
    
    
    public static void main(String args[]) {
    	int id;
    	String fname,lname,city,state;
    	Scanner sc=new Scanner(System.in);                //dynamic input
    	System.out.println("Enter id:");
    	id=sc.nextInt();
    	
    	System.out.println("Enter first name:");
    	fname=sc.nextLine();
    	System.out.println("Enter second name:");
    	lname=sc.nextLine();
    	System.out.println("Enter city:");
    	city=sc.nextLine();
    	System.out.println("Enter state:");
    	state=sc.nextLine();
    	Employee obj=new Employee(id, fname, lname, city, state)   ;                //hardcoded input, obj is required for constructor
    	fetch();       //static method called
      
    }
}
