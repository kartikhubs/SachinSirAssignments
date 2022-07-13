package inheritance;


class finalcons{
	static final int x;
	static {
		x=67;
	}
}
class Subclass extends finalcons{
	public void change() {
	
		System.out.println("THre changed value is :"+x);
	}
}

class Finalword{
	public static void main(String args[]) {
		Subclass obj=new Subclass();
		obj.change();
	}
}