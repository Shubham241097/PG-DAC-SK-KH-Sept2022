//Write a java program to print all the Prime factors of the given number.//
import java.util.Scanner;
public class Assg1_18{
	public static void main(String[]args){
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Enter the Number.");
			num=sc.nextInt();
		
			System.out.println("--------------------------");
			System.out.println("Prime Factors of "+num+" are :");
			for(int i=1;i<=num;i++){
			
				if(num%i==0){
				
					int flag=0;
					for(int j=2;j<i;j++){
						if(i%j==0){
							flag++;
						}
					}
					if(flag==0){
						System.out.print(i+" ,");
					}
				}
			}
			System.out.println();
		}while(num!=0);
	}
}