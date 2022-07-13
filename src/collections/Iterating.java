package collections;
import java.util.Iterator;
import java.util.*;
public class Iterating {
   public static void main(String args[]) {
	   ListIterator<Integer>list=null;
	   List<Integer>arr=new ArrayList<>();
	   arr.add(1);
	   arr.add(2);
	   arr.add(3);
	   arr.add(5);
	 list=arr.listIterator();
	   while(list.hasPrevious()) {
		   System.out.print(list.previous());
	   }
	   
   }
}
