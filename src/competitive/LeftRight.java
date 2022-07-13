package competitive;
import java.util.*;

public class LeftRight {
	
	
	static String t="";
	static String z="";
	public String reduce(String x) {
		char left=x.charAt(0);
		char right=x.charAt(x.length()-1);
		if(left<right) {
			t+=left;
			x=x.replace(Character.toString(left), "");       //Char to String using Character Wrapper object
			reduce(x);
		}
		
		else if(right<left) {
			z+=right;
			x=x.replace(Character.toString(right), "");
			reduce(x);
			
		}
		return x;
		
		
	}

	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LeftRight object=new LeftRight();
		String s=sc.nextLine();
		s=object.reduce(s);
		System.out.println(s);
	}
}