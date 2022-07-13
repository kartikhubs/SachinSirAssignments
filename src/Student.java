class Address{
	int streetno;
    int pincode;
    String area;
    String landmark;
    String city;
    String state;
    
    Address(int streetno,int pincode,String area,String landmark,String city,String state){
    	this.streetno=streetno;
    	this.pincode=pincode;
    	this.area=area;
    	this.landmark=landmark;
    	this.city=city;
    	this.state=state;
    	
    }
}


public class Student {
	
	int roll_no;
	String name;
	Address addr;
	
	public Student(int rollno,String name,Address address){
		this.roll_no=rollno;
		this.name=name;
		this.addr=address;
	}
	
	public static void main(String args[]) {
		Address obj=new Address(112,482008,"Rampur","Mandir","JBP","MP");
		Student obj1=new Student(74,"KARTIK",obj);
		System.out.println(obj1.addr.streetno);
		System.out.println(obj1.addr.pincode);
		System.out.println(obj1.addr.area);
		System.out.println(obj1.addr.landmark);
		System.out.println(obj1.addr.city);
		System.out.println(obj1.addr.state);
	}

}
