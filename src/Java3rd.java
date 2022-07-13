import java.util.*;
public class Java3rd {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   int a,b;
	   a=sc.nextInt();
	   b=sc.nextInt();
	   if(a==b) {
		   System.out.println("NUMBERS ARE EQUAL");
		   int age;
		   age=sc.nextInt();
		   if(age<18) {
			   System.out.println("NOT ELIGIBLE TO VOTE");
		   }
		   else {
			   System.out.println("ELIGIBLE");
		   }
	   }
	   else {
		   System.out.println("NUMBER ARE NOT EQUAL");
	   }
	   sc.close();
   }
}
	