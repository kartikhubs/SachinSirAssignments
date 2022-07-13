package collections;
import java.util.Vector;
public class Vectoring {
     public static void main(String args[]) {
    	 Vector<Integer>vect= new Vector<Integer>(3,6); 
    	 vect.add(1);
    	 vect.addElement(2);
    	 vect.addElement(3);
    	 vect.add(null);
    	 vect.add(76);
    	 System.out.println("--------------------------------------------------------");
    	 for(int i=0;i<vect.size();i++) {
    		 System.out.println(vect.get(i));
    	 }
    	 
    	 
    	 
    	 System.out.println("Size of vector :"+" "+vect.capacity());
     }
}
