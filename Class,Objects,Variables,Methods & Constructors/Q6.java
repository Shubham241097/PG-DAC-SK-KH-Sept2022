// 6.Java program to create outer class Bank Account and the Inner class Interest in it.


/*
class BankAccount{
	static class Interest{
		private double interest;
		public Interest(){
			this.interest=0.0;
		}
		public Interest(double interest){
			this.interest = interest;
		}
	}
	
	private long accno;
	private String name;
	private double balance;
	public BankAccount(){
		
	}
	public BankAccount(long accno,String name,double balance,double interest){
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		this.Interest.interest=interest;
	}
	
	public void display(){
		System.out.print("Account Details[ Account no : "+accno+", Person Name : "+name+" ]\n");               
		System.out.print("[ Interest : "+this.Interest.interest+", Account Balance : "+balance+" ]\n");
	}
}

public class Q6{
	public static void main(String[]args){
		BankAccount b1 = new BankAccount(1001,"Alpha",9450.08,8.5);
	}
}
*/



class BankAccount 
{
    int principal = 200, rate = 4, time = 2;
	
    void test() 
    {
        Interest inner_obj = new Interest();
        inner_obj.display();
    }
	
    class Interest 
    {
        void display() 
        {
            int si = (principal * rate * time) / 100;
            System.out.println("Interest : " + si + " Rs");
        }
    }
}

public class Q6
{
	public static void main(String args[]) 
    {
        BankAcct outer_obj = new BankAcct();
        outer_obj.test();
    }
}