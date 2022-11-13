//Pattern11
//ABCDEF
//ABCDE
//ABCD
//ABC
//AB
//A
//A
//AB
//ABC
//ABCD
//ABCDE
//ABCDEF

import java.util.Scanner;
public class Pattern11{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines"); 
		int n = sc.nextInt();
		
		
		for(int i=(n+64);i>=65;i--){
			for(int j=65;j<=i;j++){
				System.out.print( (char)j );
			}
			System.out.println();
		}
		for(int i=65;i<=(n+64);i++){
			for(int j=65;j<=i;j++){
				System.out.print( (char)j );
			}
			System.out.println();
		}
	}
}