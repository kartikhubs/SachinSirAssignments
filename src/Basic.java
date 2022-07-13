import java.util.*;
public class Basic{
	int empid;
	String empfname;
	String emplname;
	int empdesk;
	String location;
	int pincode;
	
	
	public Basic(int empid,String empfname,String emplname,int empdesk,String location,int pincode) {
		this.empid=empid;
		this.empfname=empfname;
		this.emplname=emplname;
		this.empdesk=empdesk;
		this.location=location;
		this.pincode=pincode;
		
	}
	
	public void displaydetails() {
		System.out.println(this.empid+" "+this.empfname+" "+this.emplname+" "+this.empdesk+" "+this.location+" "+this.pincode);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int id,desk,pin;
		String fname,lname,location;
		id=sc.nextInt();
		desk=sc.nextInt();
		pin=sc.nextInt();
		fname=sc.nextLine();
		
		location=sc.nextLine();
		lname=sc.nextLine();
		Basic obj=new Basic(id,fname,lname,desk,location,pin);
		obj.displaydetails();
		sc.close();
	}
}