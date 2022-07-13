package java8;
import java.util.*;

@FunctionalInterface
interface A{
	public int increment(int x);
}

public class Lambda {
     public static void main(String args[]) {
    	 A obj=(num)->
    	 {
    		 num=+6;
    		 return num;
    	 };
    	 System.out.println("The provided number is 7, now after lambda:"+obj.increment(7));
    	 
    	 List<String>list=new ArrayList<String>();
    	 list.add("A");
    	 list.add("b");
    	 list.add("c");
    	 list.add("d");
                //iterate via foreach using lambda
    	 list.forEach(
    			 (fruits)->System.out.println(fruits));
    	 
    	 
     }
}
    	 