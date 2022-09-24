//Check whether the given number is Palindrome or not.// 
import java.util.Scanner;

public class Assg1_17{
	public static void main(String[]args){
		
		int num,temp,rev=0;
		
		Scanner sc= new Scanner(System.in);
		
		//do{
		System.out.println("Enter the Number");
		num = sc.nextInt();
		temp = num;
		System.out.println("----------------------------");
		
		if(temp==0)
			System.out.println(num+" : Number is not Palindrome ");
		
			while(temp>0){
				rev=rev*10+(temp%10);
				temp=temp/10;
			}
			if (rev==num){
				System.out.println(num+" : Number is Palindrome ");
			}
			else
				System.out.println(num+" : Number is not Palindrome ");
		
		
		//}while(num!=0);
	}
}