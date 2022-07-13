package Self;
import java.lang.*;
import java.io.*;

class MyExcept extends Exception{
	public MyExcept(String s) {
		
        try {
        	int a=5/0;
        	
        	
        }
        catch(ArithmeticException obj) {
        	/*obj.printStackTrace();*/
        	System.out.println("MS DHONI");
        }
        
        System.out.println("Kartik Newlay");
	}
}
public class Userdefined {
	public static void main(String args[]) throws MyExcept {
		try {
			throw new MyExcept("Throwing error");
		}
		catch(MyExcept e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}
	
	

}
