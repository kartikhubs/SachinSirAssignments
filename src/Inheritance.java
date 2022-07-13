import java.util.*;
class A{
         int age,height;
         String city,name,state;
         A() {
        	 System.out.println("Base class constructor");
        	 
         }
         public A(String name,int age,int height,String city,String state){
        	 this.name=name;
        	 this.age=age;
        	 this.height=height;
        	 this.city=city;
        	 this.state=state;
         }
         
         
         
}
class B extends A{
	public B(String name,int age,int height,String city,String state) {
		super(name, age, height, city, state);
	}
	
	public void display() {
		System.out.println(name +"#"+age+"#"+height+"#"+city+"#"+state);
	}
}

class Inheritance{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age,height;
		String city,name,state;
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter height");
		height=sc.nextInt();
		System.out.println("Enter city");
		city=sc.nextLine();
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter state");
		state=sc.nextLine();
		B obj=new B(name,age,height,city,state);
		state=sc.nextLine();
		obj.display();
	}
}
