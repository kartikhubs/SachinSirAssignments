package exceptions;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Nestedtry {
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try {
		
			try {
				int []arr=new int[7];
				arr[1]=97;
				System.out.println(arr[2]);
				try {
					int x=sc.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Entered input is string instead of integer");
				}
			}
			catch(ArrayIndexOutOfBoundsException obj) {
				System.out.println("No index such");
			}
			
			finally {
				System.out.println("HHHHHHHHHH");
				
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("at line no 10");
		}
		catch(ArithmeticException e){
			System.out.println("Exception  at line no 8");
		}
		
		finally {
		
			System.out.println("ALWAYS");
		}
	}

}
