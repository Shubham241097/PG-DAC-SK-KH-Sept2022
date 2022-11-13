//23. Java Program to Demonstrate Usage of an Instance Variable in the Test Class

class Test{
	int a=5;
	int b=10;
	
	int sum=a+b;
}

public class Q23{
	public static void main(String[]args){
		Test t1 = new Test();
		System.out.println(t1.sum);
	}
} 