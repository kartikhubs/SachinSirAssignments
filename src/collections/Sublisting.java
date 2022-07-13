package collections;
import java.util.ArrayList;
public class Sublisting {
   public static void main(String args[]) {
	   ArrayList<String>langs=new ArrayList<String>();
	   langs.add("Hindi");
	   langs.add("English");
	   langs.add("Marathi");
	   langs.add("Spanish");
	   langs.add("Tamil");
	   System.out.println("Original arraylist is "+langs);
	   
	   System.out.println("###############################################");
	   //sublist
	   ArrayList<String>sub=new ArrayList<String>(langs.subList(1, 4));
	   System.out.println("SUBLIST IS :"+sub);
	   
	   System.out.println("CONTAINS METHOD()");
	   System.out.println("IS Hindi present??????? "+" "+langs.contains("Hindi"));
   }
}
