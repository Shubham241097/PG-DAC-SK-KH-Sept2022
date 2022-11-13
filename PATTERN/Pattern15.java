//Pattern15
//1 2 3 4 5 6
// 2 3 4 5 6
//  3 4 5 6
//   4 5 6
//    5 6
//     6

import java.util.Scanner;
public class Pattern15{
	public static void main(String []args){
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
	}
}