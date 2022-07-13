import java.util.*;
class Details {
    String company,color,type,ownername;
    int LoanAmount,price;
    public Details(String company,String color,String type,String ownername,int price) {
    	this.company=company;
    	this.color=color;
    	this.ownername=ownername;
    	this.price=price;
    }
    public void display() {                       //this will display the details i.e., 1st method
    	System.out.println("Company of the car :"+this.company+" "+"Color of the car :"+this.color+" "+"Owner of the car :"+this.ownername+" "+"Price of the car :"+this.price);
    }
    public void purpose() {            //2nd method
    	if(this.type=="SUV") {
    		System.out.println("LONG ROUTES");
    	}
    	else if(this.type=="Sedan") {
    		System.out.println("Urban Areas");
    			
    	}
    	else if(this.type=="Jeep") {
    		System.out.println("Jungle Safari");
    	}
		
    }
    
    public int LoanAmount() {       //3rd method
    	if(this.price>100000) {
    		return 200000;
    	}
    	else if(this.price>300000 && this.price<600000) {
    		return 100000;
    	}
    	else {
    		return 120000;
    	}
    
    
    
}}
class Subclass extends Details{                   //subclass

	public Subclass(String company, String color, String type, String ownername, int price) {
		super(company, color, type, ownername, price);             //inheriting
		
	}
	
	
	
	
}
	
 class Car2{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String company,color,type,ownername;
		int price;
		System.out.println("ENTER THE DETAILS!!!");
		System.out.println("Company:");
		company=sc.nextLine();
		System.out.println("Color:");
		color=sc.nextLine();
		System.out.println("Type:");
		type=sc.nextLine();
		System.out.println("Owner:");
		ownername=sc.nextLine();
		System.out.println("Price:");
		price=sc.nextInt();
		
		
		
		
		
		Details obj=new Details(company,color,type,ownername,price);          //object for parent class
		Subclass obj1=new Subclass(company,color, type, ownername, price);         //object for child class
		System.out.println("THE ENTERED DETAILS ARE:");
		obj1.display();
		
		System.out.println("Loan required is:" + obj1.LoanAmount());
		System.out.println("The purpose for the car is: ");
		obj1.purpose();
		sc.close();
		
		
	}
		
	
}




