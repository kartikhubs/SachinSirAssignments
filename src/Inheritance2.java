import java.util.*;   //for Scanner classes


class Child extends Inheritance2{
	//first method
	public void EvenOdd(int Number) {                //function invoked from line no 60
		if(Number%2==0) { 
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
	
	//second method
	public void EvenOdd20() {                                              //function invoked from line no 63
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println("Number is :"+" "+i+" "+"even");
			}
			else {
				System.out.println("Number is :"+" "+i+" "+"odd");
			}
		}
	}
	
	//third method
	public void MaxOfThree(int numberOne,int numberTwo,int numberThree) {         //function invoked from line no 73
		if(numberOne>numberTwo && numberOne>numberThree) {
			System.out.println("First number is the greatest");
		}
		else if(numberTwo>numberOne && numberTwo>numberThree) {
			System.out.println("Second number is the greatest");
		}
		else {
			System.out.println("Third number is the greatest");
		}
	}
	
	//fourth method
	public void Eligible(int age) {                                 //function invoked from line no 77
		if(age>=18) {
			System.out.println("Age is eligible for voting");
		}
		else {                                                              //if age<18, not eligible, else, eligible
			System.out.println("Age is not eligible for voting");
		}
	}
}
public class Inheritance2 {
	

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);  
		Child obj=new Child();                        //object of child class created
		int Number;
		int numberOne,numberTwo,numberThree;              //local variables
		int age;
		
		System.out.println("Enter the number to check whether it is even or not?");
		Number=sc.nextInt();
		
		obj.EvenOdd(Number);                                             //calling first method, line no 6
		System.out.println("##############################");
		System.out.println("List of all even and odd numbers till 20");
		obj.EvenOdd20();                                                 //calling  second method, line no 16
		
		System.out.println("###############################");
		
		System.out.println("Find the greatest number among three");
		numberOne=sc.nextInt();
		numberTwo=sc.nextInt();
		
		numberThree=sc.nextInt();
		
		obj.MaxOfThree(numberOne, numberTwo, numberThree);             //calling third method, line no 28
		System.out.println("#################################");
		System.out.println("Enter the age to check if eligible to vote or not");
		age=sc.nextInt();
		obj.Eligible(age);                                               //calling fourth method, line no 41
		sc.close();
		
		
		
	}

}
