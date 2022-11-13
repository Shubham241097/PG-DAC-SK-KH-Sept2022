//Pattern24
//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15


import java.util.*;
public class Pattern24{
	public static void main(String args[]){
		int i;
		int j;
		int k=0;
		
		System.out.print("\nEnter the no of rows of pattern you want : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		
		for(i=1 ; i<=n ; i++){
			for(j=1 ; j<=i ; j++){
				if(j==1)
				{
					k=i;
					System.out.print(k+" ");
				}
				else
				{
					k = k + (n-j+1);
					System.out.print(k+" ");
				}
				
			}
			System.out.println();
		}
		
	}
}