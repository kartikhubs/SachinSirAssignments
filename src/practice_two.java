package practicefolder;

class A{
	int emp_id,roll_no;
	A(){
		System.out.println("Base class constructor");
	}
	
	public A(int emp_id,int roll_no) {
		this.emp_id=emp_id;
		this.roll_no=roll_no;
	}
}

class B extends A{              //inheritance with constructor
    
	
	B(){
		System.out.println("Second cons");
	}
	
	public B(int emp_id, int roll_no) {
		         //accessing parent class arguments

		System.out.println("Subclass calling...");
	    
	}
	
	
	
}

public class practice_two{
	public static void main(String args[]) {
		
		B obj=new B(123,74);
		
	}
}