import java.util.Scanner;

public class Assg1_7{
	
	static void printdigit(int num){
		if(num>0){
			printdigit(num-1);
			System.out.println(num);	
		}
		
	}
	
	
	public static void main(String [] args){
	
	System.out.println("Enter the Number upto which you want to print the digit");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("--------------------------------------------------------");
	
	printdigit(num);
	
	}
	
	
	/*
	static int printdigit(int num){
		if(num>0){
			printdigit(num-1);
			System.out.println(num);	
		}
		return num;
	}
	
	
	public static void main(String [] args){
	
	System.out.println("Enter the Number upto which you want to print the digit");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("--------------------------------------------------------");
	
	int temp = printdigit(a);
	
	}
	*/
	
	
}