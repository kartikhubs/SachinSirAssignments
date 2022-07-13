package Assignment1;
import java.util.*;
public class palindromeint {
    public static void main(String args[]) {
    	Scanner obj=new Scanner(System.in);
    	for(int x=1;x<=5;x++) {
    	 int N=obj.nextInt();
    	 int cnt=0;
    	 int []arr=new int[100];
    	 int k=0;
    	 while(N!=0) {
    		arr[k]=N%10;
    		k++;
    		N/=10;
    	}
    	if(k%2==0) {
    		for(int p=0;p<k/2;p++) {
    			if(arr[p]==arr[k-p-1]) {
    				cnt++;
    			}
    		}
    		if(cnt==k/2) {
    			System.out.println("PALINDROMIC NUMBER");
    		}
    		else {
    			System.out.println("NON PALINDROMIC NUMBER");
    		}
    	}
    	else {
    		for(int p=0;p<=k/2;p++) {
    			if(arr[p]==arr[k-p-1]) {
    				cnt++;
    			}
    		}
    		
    		if(cnt==k/2+1) {
    			System.out.println("PALINDROMIC NUMBER");
    		}
    		else {
    			System.out.println("NON PALINDROMIC NUMBER");
    		}
    	}}
    	obj.close();
    	
    	
    	
    		
    	}
    }
	
