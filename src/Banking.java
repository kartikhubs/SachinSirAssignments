package practicefolder;
import java.util.*;

class Account{
	public double balance;
	Account(){
		
	}
	Account(double balance){
		this.balance=balance;
	}
	
	public void deposit(double amt) {
		this.balance+=amt;
	}
	
	public void withdraw(double withdraw_amt) {
		this.balance-=withdraw_amt;
	}
}

class SavingsAccount extends Account{
	public double interest;
	SavingsAccount(double interest){
		
		this.interest=interest;
	}
	public void addinterest() {
		super.balance+=(interest/100)*super.balance;
	}
	
}
class CurrentAccount extends Account{
	public double overdraft;
	CurrentAccount(double overdraft){
		this.overdraft=overdraft;
		
	}
	public void checkOverdraft() {
	
	   if(overdraft>super.balance) {
		   System.out.println("No enough money");
	   }
	   else {
		   System.out.println("No issues");
	   }
	
}



public class Banking{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		Bank []classarr=
	}
	
}
}
