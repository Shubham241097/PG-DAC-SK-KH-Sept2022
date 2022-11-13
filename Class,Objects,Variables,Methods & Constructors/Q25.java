//25. Java Program to Check Whether Which One is Executed First, Static Block or the Static Method

class Test{
	static{
		System.out.println("Inside Static block");
	}
	
	public static void print(){
		System.out.println("Inside Static method");
	}
}
public class Q25{
	public static void main(String[]args){
		
		//calling static method 
		Test.print();
		
		//static block is the first to be executed in the class 
		//followed by Constructor and then the class methods
	}
}


/*
Output

Inside Static block
Inside Static method

*/