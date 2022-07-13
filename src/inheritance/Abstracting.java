package inheritance;
abstract class Animal{
	public abstract void sound();
	
	
}

class Lion extends Animal{
	public void sound() {
		System.out.println("Roar!!");
	}
	
}

class Dog extends Animal{
	public void sound() {
		System.out.println("Wooof");
	}
}
public class Abstracting {
	public static void main(String args[]) {
   Animal obj=new Lion();
   Animal obj1=new Dog();
   obj.sound();
   obj1.sound();
}
}
