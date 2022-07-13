package Self;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ToString {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int []arr= new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
	
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	}
	