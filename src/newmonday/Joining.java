package newmonday;
import java.util.*;
public class Joining {
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	
        	ArrayList<Integer>arr1=new ArrayList<Integer>();
        	
        	ArrayList<Integer>arr2=new ArrayList<Integer>();
        	
        	System.out.println("Enter elements for arraylist one");
        	for(int i=0;i<10;i++) {
        		arr1.add(sc.nextInt());
        	}
        	
        	System.out.println("----------------------------------------------");
        	System.out.println("Enter elements for arraylist two");
        	
        	for(int i=0;i<10;i++) {
        		arr2.add(sc.nextInt());
        	}
        	
        	
        	
        	System.out.println("Arraylist one is :"+" "+arr1);
        	System.out.println("Arraylist two is :"+" "+arr2);
        	System.out.println("----------------------------------------");
        	System.out.println("Joining two arraylist will make :");
        	arr1.addAll(arr2);         //addAll() joins the two arraylists
        	System.out.println(arr1);
        }
}
