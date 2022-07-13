package Self;

public class StaticandInstance {
	StaticandInstance(){
		System.out.println("This is a constructor");
	}

	/*static {
		System.out.println("Static block");
	}*/
	
	{
		System.out.println("HELLLO");
	}
	public static void main(String args[]) {
		StaticandInstance obj=new StaticandInstance();
	}
}
