package inheritance;

abstract class Bank{
	public abstract int currentbalance();
}

class Savings extends Bank{
	int currbal=578;
	public int currentbalance() {
		return currbal;
	}
}

class Account extends Savings{
	public void showdetails() {
	   System.out.println("You have a savings account:"+currbal);
	}
	
}
public class Anotherabstract {
   public static void main(String args[]) {
	   Bank obj=new Savings();
	   System.out.println("My current balance is :"+obj.currentbalance());
	   Bank obj1=new Account();
	   obj1.showdetails();
   }
}
