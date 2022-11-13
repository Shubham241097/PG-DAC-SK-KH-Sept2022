//Pattern9
//1 2 3 4 5
// 2 3 4 5
//  3 4 5
//   4 5
//    5
//   4 5
//  3 4 5
// 2 3 4 5
//1 2 3 4 5

import java.util.Scanner;
public class Pattern9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines"); 
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				if(j<i){
					System.out.print(" ");
				}
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=n;i>1;i--){
			for(int j=1;j<=n;j++){
				if(j<i-1){
					System.out.print(" ");
				}
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}