import java.util.Scanner;

public class Assg1_5{
	
	public static void main(String[]args){
		
		int num;
		
		do{
			System.out.println("Enter the Number.");
			
			Scanner sc= new Scanner(System.in);
			num= sc.nextInt();
			
		if(num>0)
			System.out.println("Number is Positive.");
		else if(num==0)
			System.out.println("Number is Zero");
		else
			System.out.println("Number is Negative");
		
		}while(num!=0);
		
	}
}