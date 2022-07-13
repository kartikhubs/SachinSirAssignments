package newmonday;
import java.util.ArrayList;
public class Increase {
   public static void main(String args[]) {
	   ArrayList<Integer>arr=new ArrayList<Integer>(5);
	   arr.add(17);
	   arr.add(89);
	   arr.add(103);
	   arr.add(765);
	   arr.add(73);
	   System.out.println("Original arraylist is :"+arr);
	   
	   //arr.add(123);        The below statement will create error as it exceeds the size
	   
	   arr.ensureCapacity(7); //size increased to 7
	   arr.add(123);
	   arr.add(10);
	   System.out.println("Now it is: "+arr);
   }
}
