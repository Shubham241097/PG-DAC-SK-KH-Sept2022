// Pattern 4
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

public class Pattern4{
	public static void main(String args[]){	
		int n=6;
		for(int i=1 ; i<n ; i++){
			int coef = 1;
			
			for(int k=n-i ; k>0 ; k--){
				System.out.print(" ");
			}
			
			for(int j=1 ; j<=i ; j++){
				System.out.print(coef+" ");
				coef = coef * (i-j)/j;
			}
			System.out.println();
		}
	}
}

