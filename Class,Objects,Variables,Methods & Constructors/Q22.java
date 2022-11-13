//22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method


class BankAccount{
	private static int accno=1000; /////////////
	private double balance;
	
	public BankAccount(){
		
	}
	public BankAccount(int balance){
		this.balance=balance;
		accno++;
	}
	public String toString(){
		return "Account Details [ Account No. : "+accno+", Balance : "+balance+" ]\n";
	}
}

public class Q22{
	public static void main(String[]args){
		BankAccount b1 = new BankAccount(10000);
		BankAccount b2 = new BankAccount(12500);
		
		System.out.println( b1.toString() );
		System.out.println( b2.toString() );
	}
}