//To print Even Number series 2,4,6,8,10,12,14,16...//
import java.util.Scanner;
public class Assg1_19{
	public static void main(String[]args){
		
		System.out.println("Enter the number.");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("--------------------------");
		System.out.println();
		
		System.out.println("Even Series : ");
		for(int i=1;i<=num;i++){
			
			if(i%2==0){
				System.out.print(i+" ,");
			}
		}
	}
}