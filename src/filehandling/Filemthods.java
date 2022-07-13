package filehandling;
import java.io.*;
public class Filemthods {
     public static void main(String args[]) {
    	 try {
    		//creating the object to the file location
    		 File newfile=new File("Kartiksecond.txt");
    		 if(newfile.createNewFile()) {                                //creating a file(boolean)
    			 System.out.println("File is created......!");
    		 }
    		 else {
    			 System.out.println("File is already there...!");
    		 }
    		 
    		
    		 if(newfile.canWrite()) {
    			 System.out.println("We can write into the file");
    			 FileWriter fwrite=new FileWriter("Kartiksecond.txt");
    			 fwrite.write("Hello I am kartik newlay, a java developer");
    			 System.out.println("Data written");
    			 fwrite.close();
    		 }
    		 else {
    			 System.out.println("Unable to write");
    		 }
    		 
    		 if(newfile.canRead()) {
    			 char []arr=new char[1000];
    			 System.out.println("File is getting read");
    			 FileReader fread=new FileReader("Kartiksecond.txt");
    			 System.out.println("The file content is:" +fread.read(arr));
    			 fread.close();
    			 
    		 }
    	 }
    	 catch(IOException e) {
    		 e.printStackTrace();
    	 }
     }
}