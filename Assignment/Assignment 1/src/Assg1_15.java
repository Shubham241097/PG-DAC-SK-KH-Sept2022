import java.util.Scanner;
public class Assg1_15{
	public static void main(String[]args){
		
		int temp=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2");
		int num2=sc.nextInt();
		
		for(int i=1;i<=num1&&i<=num2;i++){
			if(num1%i==0 && num2%i==0){
				temp=i;
			}
		}
		System.out.println("LCM of two numbers is:"+((num1*num2)/temp));
		
	}
}