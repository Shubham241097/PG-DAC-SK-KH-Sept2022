//Pattern12
//     A
//    A B
//   A B C
//  A B C D
// A B C D E
//A B C D E F

import java.util.Scanner;
public class Pattern12{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines"); 
		int n = sc.nextInt();
		
		for(int i=65;i<(65+n);i++){
			for(int k=(65+n);k>i;k--){
				System.out.print(" ");
			}
			for(int j=65;j<=i;j++){
				System.out.print(((char)j) + " ");
			}
			System.out.println();
		}
	}
}