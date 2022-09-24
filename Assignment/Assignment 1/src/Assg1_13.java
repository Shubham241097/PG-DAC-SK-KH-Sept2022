//Write a java program to reverse a given number.//
import java.util.Scanner;

public class Assg1_13{
	public static void main(String []args){
		
		int num,temp,rev=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num =sc.nextInt();
		temp=num;
			
		while(num!=0){

			
			temp=num%10;
			num=num/10;
			rev=rev*10+temp;
		}
		System.out.println("Reverse : "+rev);
	}
}