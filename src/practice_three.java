package practicefolder;

class Parent{

    Parent(){
		System.out.println("First");
	}
	
    Parent(int x){
		this();
		System.out.println("HELLO");
	}
}
class Bb extends Parent{
	Bb(){
	
		System.out.println("Second");
		
	}
	public Bb(int x) {
		super(x);
		System.out.println(x);
	}
	
	
	
	
}


public class practice_three{
	public static void main(String args[]) {
		Bb obj=new Bb(7);
		
		
	}
}

