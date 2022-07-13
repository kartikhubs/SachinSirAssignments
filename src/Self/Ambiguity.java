package Self;

interface UpperOne{
	public void show();
	
	
}

interface UpperTwo{
	public void showone();
	
}

class Children implements UpperOne,UpperTwo{


	public void showone() {
		System.out.println("Pehle ka baccha");
		
	}

	
	public void show() {
		System.out.println("Dusre ka bachha");
		
	}

}

public class Ambiguity {

	public static void main(String args[]) {
		Children obj=new Children();
		obj.showone();
		obj.show();
	}
}