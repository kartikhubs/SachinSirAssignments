
public class Staticclass {
	static int number=5,age=22;
	static String name="KARTIK";
	
	public static void staticcall() {
		System.out.println(number);
		System.out.println(name);
	}
	public void normalcall() {
		System.out.println(number);
		System.out.println(name);
		staticcall();
	}
	
	public static void main(String args[]) {
		System.out.println("CHecking via static style");
		staticcall();
		System.out.println("-------------_______-----------");
		System.out.println("Checking normally");
		Staticclass obj=new Staticclass();
		obj.normalcall();
	}
}
	
