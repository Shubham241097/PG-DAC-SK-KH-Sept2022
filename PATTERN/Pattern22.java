//Pattern22
//1111111
//1111122
//1111333
//1114444
//1155555
//1666666
//7777777

import java.util.Scanner;
public class Pattern22{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines btw 0-9"); 
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--){
				if(j>i){
					System.out.print("1");
				}
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}