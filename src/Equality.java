package practicefolder;

class Parenting{
	Parenting(){
		System.out.println("This is a base class");
	}
}



public class Equality extends Parenting {
	public static void main(String args[]) {
		Equality obj=new Equality();
		Parenting obj1=new Parenting();
		System.out.println(obj1.equals(obj));
		
		
	}

	
}
