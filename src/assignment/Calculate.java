package assignment;
import java.util.*;

class SelectOP{
	public void findanswer(int choice) {
		Scanner input=new Scanner(System.in);
		switch (choice) {
			case 1:
				System.out.println("Enter two number to add");
				int a,b;
				a=input.nextInt();
				b=input.nextInt();
				System.out.println("The sum is :"+(a+b));
				break;
			case 2:
				System.out.println("Enter 2 nos to multiply");
				int x,y;
				x=input.nextInt();
				y=input.nextInt();
				System.out.println("Product is :"+x*y);
				break;
			case 3:
				System.out.println("Enter 2 numbers to find quotient");
				int numOne,numTwo;
				numOne=input.nextInt();
				numTwo=input.nextInt();
				System.out.println("Quotient is :"+(numOne/numTwo));
		}
			
	}
}

public class Calculate {
       public static void main(String args[]) {
    	   SelectOP obj=new SelectOP();
    	   Scanner sc=new Scanner(System.in);

    	   while(true) {
    		   System.out.println("Enter 1 for adding"+'\n'+"Enter 2 for multiplying"+'\n'+"Enter 3 for dividing"+'\n'+"Enter 4 for exiting");
    		   int ch=sc.nextInt();
    		   if(ch!=4) {
    			   obj.findanswer(ch);
    			   
    		   }
    		   else {
    			   break;
    		   }
    		   
    	   }
       }
}
