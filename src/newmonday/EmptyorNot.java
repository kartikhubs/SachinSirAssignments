package newmonday;
import java.util.*;

class A{
	public void checkEmpty(ArrayList<Integer>x) {
		if(x.size()==0) {
			System.out.println("The inserted arraylist is empty");
		}
		else {
			System.out.println("The inserted arraylist is not empty");

		}
		
	}
}
public class EmptyorNot {
      public static void main(String args[]) {
    	  A obj=new A();
    	  ArrayList<Integer>input=new ArrayList<Integer>();
    	  obj.checkEmpty(input);
    	  System.out.println(input.size());
      }
}
    	 
