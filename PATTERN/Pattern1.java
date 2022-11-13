
//Pattern 1
//     *
//    * *
//   *   *
//  *     *
// * * * * * * * * *

import java.util.Scanner;
public class Pattern1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines"); 
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i+4;j++){
				if(i<n){
					if(j==1 || j==i){
						System.out.print(" *");
					}
					else
					System.out.print("  ");
				}
				else
					System.out.print(" *");
			}
			System.out.println();
		}
		
	}
}