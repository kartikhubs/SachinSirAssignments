package collections;
import java.util.Enumeration;
import java.util.Hashtable;
public class Hashtabling {
	public static void main(String args[]) {
		Hashtable<Integer,String>table=new Hashtable<Integer,String>();
		table.put(1, "NEWLAY");
		table.put(2, "KARTIK");
		table.put(27, "Global");
		table.put(4,"Lenovo");
		Enumeration<Integer> name=table.keys();
		
		while(name.hasMoreElements()) {
			System.out.println(name.nextElement());
		}
	}

}
