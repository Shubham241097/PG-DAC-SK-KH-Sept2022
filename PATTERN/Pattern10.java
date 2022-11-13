//Pattern10
//A
//B B
//C C C
//D D D D
//E E E E E
//F F F F F F

import java.util.Scanner;
public class Pattern10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines"); 
		int n = sc.nextInt();
		
		for(int i=65;i<(65+n);i++){
			for(int j=65;j<=i;j++){
				System.out.print(((char)i) +" ");
			}
			System.out.println();
		}
	}
}