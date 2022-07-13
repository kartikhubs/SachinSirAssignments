package practicefolder;

public class practice_one {

	public static void show() {
		System.out.println("This is a static method");
	}
	public void connect() {
		show();             //invoking static method from  a non-static method
	}
	
	public static void main(String args[]) {
		practice_one obj=new practice_one();
		obj.connect();
	}
}