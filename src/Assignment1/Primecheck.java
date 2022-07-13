package Assignment1;
import java.util.*;
public class Primecheck {
      public static void main(String args[]) {
    	  
    	  Scanner inp=new Scanner(System.in);
    	  for(int x=1;x<=5;x++) {
    	    int num=inp.nextInt();
    	    int cnt=0,i=1;
    	    while(i<=num) {
    		  if(num%i==0) {
    			  cnt++;
    		  }
    		  i++;
    	  }
    	
    	    if(cnt>2) {
    		  System.out.println("Not a prime");
    	    }
    	    else {
    		  System.out.println("Prime");
    	   }}
    	  inp.close();
    	  
      }
}
	