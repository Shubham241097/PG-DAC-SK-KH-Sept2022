//Pattern25
//1234567
//2345671
//3456721
//4567321
//5674321
//6754321
//7654321

import java.util.Scanner;
public class Pattern25{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines btw 0-9"); 
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print(j);
			}
			//int temp=i;
			
			if(i>1){
				int temp=i;
				
				while(temp!=0){
					temp--;
					
					if(temp>0)
						System.out.print(temp);
				}
			}
			System.out.println();
		}
		
	}
}