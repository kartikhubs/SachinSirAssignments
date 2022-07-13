package java8;
import java.lang.*;
interface Method{
	public void display();                        //static method refernce
}

class Methodtwo{
	public static void print() {
		System.out.println("static reference");
	}
}
public class MethodRef {
	
	
	public static void main(String args[]) {
		Thread obj=new Thread(Methodtwo::print);
		obj.start();
		
		
		
	}
  
}
