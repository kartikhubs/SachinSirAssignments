package Self;
import java.io.*;
public class Exceptionself {
	static int a=5;
	static int b=7;
	{
		a=100;
		b=25;
	}
	
	static {
		a=13;
		b=67;
	}
	
	
	
	
	Exceptionself(){
		System.out.println("Value of a:"+a+" "+"Value of b:"+b);
	}
	public static void main(String args[]) {
		
				
		System.out.println(a*2+" "+b*2);      //class variables
		Exceptionself obj=new Exceptionself();     //instance variable values
		System.out.println(obj.a+" "+obj.b);       //
	}
}
