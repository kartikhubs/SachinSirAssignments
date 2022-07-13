package Advanced;

class A{
	A(){
		this(5);
		System.out.println("First calling...");
	}
	A(int x){
		this(5,7);
		System.out.println(x*5);
	}
	
	A(int x,int y){
		System.out.println(x+" "+y);
	}
	
	
}

class B extends A{
	
}

public class Chains {
	public static void main(String args[]) {
	new A(3,4);
	}
}

	