import java.util.Scanner;

public class Assg1_3{
	
	static int fact(int num){
		int fact=1;
		if(num!=0){
			fact = num*fact(num-1);
			return fact;
		}
		else
			return fact;
	}
	
	public static void main(String [] args){
	
		int num;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Number.");
		num =sc.nextInt();
		
		int a = fact(num);
		System.out.println("Factorial : "+a);
	}
}