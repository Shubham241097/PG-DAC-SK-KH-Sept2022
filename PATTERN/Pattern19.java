//Pattern19
//1
//121
//12321
//1234321
//123454321
//12345654321
//1234567654321


import java.util.Scanner;
public class Pattern19{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern lines"); 
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			
			if(i>1){
				int temp=i;
				
				while(temp!=0){
					temp--;
					if(temp>0)
					System.out.print(temp);
				}
			}
			System.out.println();
		}
	}
}
