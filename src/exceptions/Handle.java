package exceptions;
import java.util.*;

public class Handle {
	
	
	public static void main(String args[]) {
		while(true){
		  Scanner sc=new Scanner(System.in);
		  try{
			
		    System.out.println("Enter the input:");
			int x=sc.nextInt();
			if(x%2==0) {
				System.out.println("EVEN");
			}
			else {
				System.out.println("ODD");
			}
		}
		
		catch(InputMismatchException e) {
			System.out.println("Incorrect output");
			System.out.println("Exception is :"+e);
			break;
		}
		
	}}
}