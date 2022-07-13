package collections;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Treeset {
       public static void main(String args[]) {
    	   
    	   Scanner sc=new Scanner(System.in);
    	   TreeSet<Integer>tree=new TreeSet<Integer>();
    	   for(int i=0;i<5;i++) {
    		   tree.add(sc.nextInt());            //scanner input
    	   }
    	   
    	   
    	   TreeSet<Integer>tree2=new TreeSet<Integer>();
    	   tree2.add(100);
    	   tree2.add(87);
    	   tree.addAll(tree2);           //addAll()
    	   
    	   //check whether element is present in treeset or not
    	   
    	   if(tree.contains(32)) {
    		   System.out.println("Yes it is present");
    		   
    	   }
    	   else {
    		   System.out.println("No");
    	   }
    	   
    	   
    	   System.out.println("Iterating the treeset");
    	   Iterator<Integer>it=tree.iterator();
    	   while(it.hasNext()) {
    		   System.out.println(it.next());
    	   }
       }
}
