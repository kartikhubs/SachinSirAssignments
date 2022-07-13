package collections;
import java.util.Deque;
import java.util.LinkedList;
public class Dequeuing {
   public static void main(String args[]) {
	   Deque<String>dq=new LinkedList<String>();
	   dq.addFirst("KARTIK");
	   dq.add("MAYANK");
	   dq.add("KARISHMA");
	   dq.add("HP");
	   dq.addLast("LENOVO");
	   dq.add("NEWLAY");
	   System.out.println("The provided inputs are: "+dq);
	   
	   
	   System.out.println("PeekFIrst()"+dq.peekFirst());
	   System.out.println("PeekLast)_"+dq.peekLast());
	   String x=dq.getFirst();
	   String y=dq.getLast();
	   System.out.println(x+"############"+y);
	   dq.pollFirst();
	   dq.peekLast();
	   System.out.println(dq.peekFirst()+"----------------"+dq.peekLast());
   }
}
