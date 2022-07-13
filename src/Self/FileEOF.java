package Self;
import java.util.*;
import java.io.*;
public class FileEOF {

	 public static void main(String args[]) {
		 try {
			 File fname=new File("globallogic.txt");
			 /*if(fname.createNewFile()) {
				 System.out.println("CREATE");
			 }
			 else {
				 System.out.println("EXISTS");
			 }*/
			 System.out.println(fname.getPath());
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}
