import java.util.*;   //for Scanner class
public class Car {
    String color,brand,model;    //instance variables
    int mfg_year;
    
    
    public Car(String color,String brand,String model,int mfg_year) {      //parameterized constructor
    	this.color=color;       //value assigned
    	this.brand=brand;
    	this.model=model;
    	this.mfg_year=mfg_year;
    }
    public void show() {
    	System.out.println("The Entered details are "+" "+this.color+" "+this.brand+" "+this.model+" "+this.mfg_year);
    }
    
    
    public static void main(String args[]) {         //main method
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Car Details....!!");
    	String color,brand,model;
    	int year;
    	System.out.println("Enter color,brand,model and year of mfg");
    	color=sc.nextLine();
    	brand=sc.nextLine();
    	model=sc.nextLine();
    	year=sc.nextInt();
    	Car obj=new Car(color,brand,model,year);      //arguments passed to the line 7
    	obj.show();
    	sc.close();
    }
}
