class First{
	First(){
		
		System.out.println("First ()");
	}
}

class Second extends First{
	Second(){
		
		System.out.println("Second ()");
	}
}

class Third extends Second{
	Third(){
		super();
		System.out.println("Third ()");
	}
	
	Third(int x,int y){
		this();
		System.out.println(x*y);
	}
}
public class Multilevel {
    public static void main(String args[]) {
    	Third obj=new Third(5,4);
    	
    	
    }
}
