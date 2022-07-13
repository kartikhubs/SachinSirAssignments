package collections;
import java.util.*;
public class Treemap {
	public static void main(String args[]) {
		TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
		map.put(1,100);
		map.put(2,101);
		map.put(1,100);

		map.put(27,100);

		map.put(87,100);

		map.put(3,100);

		System.out.println("The treemap is :"+map);
		
		
		
	}

}
