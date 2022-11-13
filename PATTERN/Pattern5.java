//Pattern5
//   1
//  212
// 32123
//4321234
// 32123
//  212
//   1

import java.util.Scanner;
public class Pattern5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines"); 
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--){
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(j);
			}
			
			for(int j=2;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=n;i>1;i--){
			for(int j=n;j>=1;j--){
				if(j<i)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			
			for(int j=2;j<i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}