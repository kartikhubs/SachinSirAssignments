package practicefolder;


class AA{
	public int x=5;
	public void show() {
		System.out.println(x);
	}
}

class BB extends AA{
	public int x=7;
	public void show() {
		System.out.println(x*2);
	}
}
public class Upcasting {
	
	public static void main(String args[]) {
		AA obj=new BB();          //UPCASTING
		
		BB obj1=new BB();       //DOWNCASTING
		
		System.out.println(obj1==obj);
		
		
	
		
	}

	
}
