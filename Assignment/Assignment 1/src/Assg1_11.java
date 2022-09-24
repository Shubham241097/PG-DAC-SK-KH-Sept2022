//Write a java program to find the smallest of 3 numbers(a,b,c).//
import java.util.Scanner;

public class Assg1_11{
	public static void main(String[]args){
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Enter the values");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a<b){
			if(a<c){
				System.out.println("Value A is Smallest.");
			}
			
		}
		else if(b<c){
			if(b<a){
				System.out.println("Value B is Smallest.");
			}
		}
			else
				System.out.println("Value C is Smallest.");
		}while(true);
	} 
}