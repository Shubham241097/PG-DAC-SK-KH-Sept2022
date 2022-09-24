//Write a Java program to find the sum of the digits of the given number.//
import java.util.Scanner;

public class Assg1_10{
	public static void main(String[]args){
		
		int num,ld,sum=0;
		Scanner sc =new Scanner(System.in);

	
		System.out.println("Enter the Number");
		num= sc.nextInt();
			
		while(num!=0){
			ld=num%10;
			num=num/10;
			sum=sum+ld;
		}
		System.out.println("Sum : "+sum);
		
		
	}
}