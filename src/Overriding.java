
class Aaa{
	public void show() {
		System.out.println("This is base class show()");
	}
}

class Bbb extends Aaa{
	
	public void show() {
		System.out.println("This is child class show()");
	}
}

class C extends Bbb{
	
	public void show() {
		System.out.println("This is child class 2 show()");
	}
}
public class Overriding extends C{
 public static void main(String args[]) {
	 C obj=new C();
	 Bbb obj1=(Bbb)obj;
	 obj1.show();
 }
}
	

