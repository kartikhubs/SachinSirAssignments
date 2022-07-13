package collections;
import java.util.Queue;
import java.util.LinkedList;

public class Queuing {
  public static void main(String args[]) {
	  Queue<String>names=new LinkedList<String>();
	  names.add("KARTIK");
	  names.add("KRITI");
	  names.add("DEVANSHI");
	  System.out.println(names);
	  System.out.println("Removed element is :"+names.remove());
	  }
}
