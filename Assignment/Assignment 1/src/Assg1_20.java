//To print the Odd Number series 1,3,5,7,9,11,13,15...//
import java.util.Scanner;
public class Assg1_20{
	public static void main(String[]args){
		
		System.out.println("Enter the number.");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("--------------------------");
		System.out.println();
		
		System.out.println("Odd Series : ");
		for(int i=1;i<=num;i++){
			
			if(i%2!=0){
				System.out.print(i+" ,");
			}
		}
	}
}