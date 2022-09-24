import java.util.Scanner;

public class Assg1_4{
	
	public static void main(String []args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		
		
		System.out.println("First: "+a+" Second: "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Swapped Values");
		System.out.println("First: "+a+" Second:"+b);
		
	}
}