import java.util.Scanner;

public class Assg1_6{
	
	public static void main(String []args){
		
		int year;
		
		do{
		System.out.println("Enter the Year: ");
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					System.out.println("It is a Leap Year");
				else
					System.out.println("It is NonLeap Year");
			}
			else
				System.out.println("It is Leap Year");
		}
		else
			System.out.println("It is NonLeap Year");
		}while(year!=0);
	}
	
}