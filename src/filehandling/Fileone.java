package filehandling;
import java.io.*;
public class Fileone {
  public static void main(String args[]) {
	  try {
		  char []arr=new char[1000];

	      
		  FileReader fread=new FileReader("Kartikfile.txt");
		  fread.read(arr);
		  
		  System.out.println(arr);
		  fread.close();
		 
		
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
	  