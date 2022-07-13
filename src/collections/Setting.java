package collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
public class Setting {
 public static void main(String args[]) {
	 HashSet<String>set=new HashSet<String>();
	 set.add("KARTIK");
	 set.add("SACHIN SIR");
	 set.add("Hello");            //duplicate
	 set.add("Globallogic");
     set.add("Hello");
     
     System.out.println("Set size is :"+set.size());
     ArrayList<String>arr=new ArrayList<String>();
     arr.add("Technical");
     arr.add("Software");
    arr.add("Engineering");
    set.addAll(arr);                       //addAll()
    
    
    System.out.println(set);
    System.out.println("---------------------------------------------");
    Iterator<String> it=set.iterator();              //iterating
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    System.out.println("Removing element:");
    set.remove("KARTIK");
    System.out.println("Now set is :"+set);
    
    
    HashSet<String>set2=(HashSet)set.clone();            //cloning
    System.out.println("---------------------------------------------");
    System.out.println("The cloned set is : "+set2);	 
 }
}
