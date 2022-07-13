package inheritance;

class A{
	public int add(int x,int y) {
		return x+y;
	}
}
class B extends A{
	
	public int add(int x,int y,int z) {           //overloading
		return x*y;
	}
}

class Overload{
	public static void main(String args[]) {
		B obj=new B();
		System.out.println(obj.add(5, 7));
	}
}