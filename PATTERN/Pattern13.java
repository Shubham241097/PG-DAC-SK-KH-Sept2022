//Pattern13
//     A
//    BB
//   C  C
//  D    D
// E      E
//F        F
// E      E
//  D    D
//   C  C
//    BB
//     A

public class Pattern13{
	public static void main(String[]args){
		for(int i=65;i<=70;i++){
			for(int k=70;k>i;k--){
				System.out.print(" ");
			}
			for(int j=65;j<=i;j++){
				if(j==65 || j==i)
					System.out.print((char)i);
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=69;i>=65;i--){
			for(int k=70;k>i;k--){
				System.out.print(" ");
			}
			for(int j=65;j<=i;j++){
				
				if(j==65 || j==i)
					System.out.print((char)i);
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}