package filehandling;
import java.util.*;
import java.io.*;
public class Fileinput {
	public static void main(String args[]) {
		try {
			FileWriter fwrite=new FileWriter("Kartikfile.txt");
			Scanner sc=new Scanner(System.in);
			String input=sc.nextLine();
			
			System.out.println("DATA IS GETTING INPUT");
			fwrite.write(input);
			fwrite.close();
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
		
	}

}
