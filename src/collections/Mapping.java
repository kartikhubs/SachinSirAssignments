package collections;
import java.util.HashMap;

public class Mapping {
    public static void main(String args[]) {
    	HashMap<Integer,String>map1=new HashMap<Integer,String>();
    	map1.put(22,"KARTIK");
    	map1.put(2, "MAYANK");
    	map1.put(3,"Globallogic");
    	map1.put(2,"Lenovo");
    	System.out.println(map1.get(4));
    }
}
