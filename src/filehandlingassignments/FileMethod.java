package filehandlingassignments;
import java.io.*;
import java.util.Scanner;
public class FileMethod {
	public static void main(String args[]) {
		
		try {
                File filename=new File("globallogic.txt");
                /*if(filename.createNewFile()) {
                	System.out.println("file is created");
                }
                else {
                	System.out.println("Already exists");
                }*/
                FileWriter fwrite=new FileWriter(filename);
                fwrite.write("Hello Java developer"); 
                fwrite.close();
                		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

	
