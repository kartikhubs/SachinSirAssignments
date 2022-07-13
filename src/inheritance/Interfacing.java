package inheritance;
import java.util.*;
interface functionality{
	public void info();
	public void infoOne(String s);
	public void infoTwo(float f);
	public static int x=7;
}

class Demo implements functionality{

	@Override
	public void info() {
	
		System.out.println("The number here is the x taken :"+x);
		
	}

	@Override
	public void infoOne(String s) {
		System.out.println("The string input is :"+s);
		
	}

	@Override
	public void infoTwo(float f) {
		System.out.println("The float value is :"+f);
		
	}
	
}

class Interfacing{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	functionality object=new Demo();
	System.out.println("Enter the string");
	String s=sc.nextLine();
	System.out.println("Enter float number");
	float f=sc.nextFloat();
	object.info();
	object.infoOne(s);
	object.infoTwo(f);
	sc.close();
	}
}
