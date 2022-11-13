//11. Java Program to Illustrate Use of Methods in a Class

public class Q11{
	public static int calMult(int a,int b){
		int mult = a*b;
		
		return mult;
	}
	
	public static void main(String[]args){
		System.out.println( "Multiplication : "+Q11.calMult(15,12) );
	}
}