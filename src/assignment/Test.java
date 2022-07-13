package assignment;
import java.util.*;
class Person {
     public String city;
     public int pincode;
     public int age;
     Person(String city,int pincode,int age){
    	 this.city=city;
    	 this.pincode=pincode;
    	 this.age=age;
     }
     
     
     
}

class Employee extends Person{
	
	public double annSal;
	public int joinyear;
	public String natInsnum;
	Employee(double annSal,int joinyear,String natInsnum,String city, int pincode, int age) {
		super(city, pincode, age);
	}
	
	
	public String dispcity() {
		return city;
		
	}
	public int dispcode() {
		return pincode;
		
	}
	public int dispage() {
		return age;
	}
	public double dispSalary() {
		return annSal;
	}
	public int dispyear() {
		return joinyear;
	}
	public String dispInsurance() {
		return natInsnum;
	}
}
public class Test{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String cityname,natInsurance;
		int age,pincode,joining;
		double salary;
		cityname=sc.nextLine();
		natInsurance=sc.nextLine();
		age=sc.nextInt();
		pincode=sc.nextInt();
		joining=sc.nextInt();
		salary=sc.nextDouble();
		Employee object=new Employee(salary,joining,natInsurance,cityname,pincode,age);
		System.out.println("Employee's age is :"+object.dispage());
		System.out.println("Employee's salary is :"+object.dispSalary());
		System.out.println("Employee's cityname is :"+object.dispcity());
		System.out.println("Employee's city pincode is :"+object.dispcode());
		System.out.println("Employee's joining year is :"+object.dispyear());
		System.out.println("Employee's Insurance number is :"+object.dispInsurance());
		
	}
}