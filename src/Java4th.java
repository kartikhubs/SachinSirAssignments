import java.util.*;
public class Java4th {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<10) {
			System.out.println("YOU ARE A KID!");
		}
		else if(age>=13 && age<=20) {
			System.out.println("TEENAGER");
		}
		else if(age>=25 && age<=50) {
			System.out.println("ADULT");
		}
		else if(age>50 && age<=100) {
			System.out.println("OLD AGE");
		}
		else {
			System.out.println("UNCATEGORIZED");
		}
		sc.close();
	}

}
