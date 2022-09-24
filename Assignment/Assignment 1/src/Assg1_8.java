// Write a java program to print the digits of a given Number//
import java.util.Scanner;

public class Assg1_8{
	
	static void printdigit(int num){
		
		if(num!=0){
			int ld=num%10;
			num=num/10;
			
			printdigit(num);
			System.out.print(ld+"-");
		}
		
	}
	
	public static void main(String[]args){
		
		int num;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println(" ");
			System.out.println("Enter the Number");
			num =sc.nextInt();
			
			printdigit(num);
			
		}while(num!=0);
		
	}
}