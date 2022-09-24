import java.util.Scanner;

public class Assg1_2{
	
	public static void main(String [] args){
		
		int num;
		int fact=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number.");
		
		num = sc.nextInt();
		
		//if(num!=0){
			for(int i=num ;i>=1 ;i--){
			
				fact = i*fact;
			}
				System.out.println("Factorial of Number is: "+fact);
		//}
		//else
		//	System.out.println("Factorial of Number is: "+fact);
	}
}