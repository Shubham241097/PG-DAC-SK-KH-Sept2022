import java.util.Scanner;

public class Assg1_1{
	
	public static void main(String [] args){
		
		int num;
		
		Scanner sc =new Scanner(System.in);
		do{
			
		System.out.println("Enter the Number.");
		num =sc.nextInt();
		
		if(num%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		
		}while(num!=0);
		
	}
}