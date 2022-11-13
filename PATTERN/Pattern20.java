//Pattern20
//1234567
// 234567
//  34567
//   4567
//    567
//     67
//      7
//     67
//    567
//   4567
//  34567
// 234567
//1234567

import java.util.Scanner;
public class Pattern20{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines btw 0-9"); 
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<i){
					System.out.print(" ");
				}
				else
					System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=n;i>1;i--){
			for(int j=1;j<=n;j++){
				
				if(j<i-1){
					System.out.print(" ");
				}
				else
					System.out.print(j);
				
			}
			System.out.println();
		}
	}
}