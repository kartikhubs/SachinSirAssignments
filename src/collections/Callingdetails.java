package collections;
import java.util.ArrayList;

import collections.Studdetails;
public class Callingdetails {
   public static void main(String args[]) {
	   ArrayList<Studdetails>obj=new ArrayList<Studdetails>();
	   obj.add(new Studdetails("KARTIK",123,74,"JABALPUR"));
	   for(Studdetails s:obj) {
		   System.out.println(s);
	   }
	   
   }
}
