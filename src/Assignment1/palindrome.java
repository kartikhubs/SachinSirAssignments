package Assignment1;
import java.util.*;
public class palindrome {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		for(int x=1;x<=5;x++) {
		String s=sc.nextLine();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		if(rev.equals(s)){
			System.out.println("PALINDROME");
		}
		else{
			System.out.println("NOT A PALINDROME");
		}
		
	}
		sc.close();
	}
	
}