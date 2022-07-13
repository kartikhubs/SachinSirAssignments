package Self;


class Parenting{
	void show() {
		System.out.println("THis is parent class calling");
	}
}

class Genes extends Parenting{
	@Override
	void show() {
		System.out.println("This is children class calling");
	}
}
public class Function {
   public static void main(String args[]) {
	   Genes obj=new Genes();
	   obj.show();
   }
}
	