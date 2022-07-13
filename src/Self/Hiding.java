package Self;


class CheckOne{
	public static void show() {
		System.out.println("This is static method found in class 1");
	}
	
	void m1() {
		System.out.println("Non static parent");
	}
}

class CheckTwo extends CheckOne{
	public static void show() {
		
		System.out.println("This is a static method found in class 2");
	}
	
	void m1() {
		super.m1();                                //calls line no 10
		System.out.println("Nonstatic child");
	}
}
public class Hiding {

	
		public static void main(String args[]) {
			CheckOne obj=new CheckTwo();
			obj.m1();
		}
}
