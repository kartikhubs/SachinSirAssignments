package Advanced;

import java.util.Vector;

public class Vectorz {

	public static void main(String args[]) {
		Vector<Integer>vect=new Vector<Integer>();
		vect.add(7);
		vect.add(76);
		vect.add(89);
		vect.clear();
		for(Integer v:vect) {
			System.out.println(v+ " ");
		}
	}
}