// 10. Java Program to Swap objects using swap() method.

class Demo{
	int a;
	Demo(){
		
	}
	Demo(int a){
		this.a=a;
	}
}

public class Q10{
	public static void main(String args[]){
		Demo d1=new Demo(10);
		Demo d2=new Demo(20);
		Demo temp=d1;
		d1=d2;
		d2=temp;
		System.out.println("Value of 'a' using d1 object : "+d1.a);  //20
		System.out.println("Value of 'a' using d2 object : "+d2.a);  //10
	}
}