package Assignment1;
import java.util.*;
public class Reversenum {
      public static void main(String args[]) {
    	  
    	  Scanner obj=new Scanner(System.in);
    	  for(int x=1;x<=5;x++) {
    	  int NUM;
    	  NUM=obj.nextInt();
    	  while(NUM!=0) {
    		  System.out.print(NUM%10);
    		  NUM/=10;
    	  }
    	  }
    	  obj.close();
      }
      


}
