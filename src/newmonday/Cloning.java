package newmonday;
import java.util.*;
public class Cloning {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   ArrayList<String>arr=new ArrayList<String>();
	   System.out.println("Enter elements in the arraylist");
	   for(int i=0;i<10;i++) {
		   arr.add(sc.nextLine());
	   }
	   
	   System.out.println("Cloning operation starts");
	   ArrayList<String>clonearr=new ArrayList<String>();
	   clonearr=(ArrayList<String>) arr.clone();           //casting
	   System.out.println("The cloned array is :"+clonearr);
	   sc.close();
	   
   }
}
