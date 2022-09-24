//Write a java program to print all the factors of the given number.//
import java.util.Scanner;

public class Assg1_9{
	public static void main(String[]args){
		
		int num;
		Scanner sc =new Scanner(System.in);
		
		do{
			System.out.println("Enter the number");
			num=sc.nextInt();
			System.out.println("--------------------------");
			
			System.out.println("Factors of the number are:");
			
			for(int i=1;i<=num;i++){
				if(num%i==0){
					System.out.print(i+" ,");
				}
				
			}
			System.out.println();
		}while(num!=0);
	}
}