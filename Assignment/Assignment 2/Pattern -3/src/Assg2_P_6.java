public class Assg2_P_6{
	public static void main(String[]args){
		for(int i=9;i>=1;i--){
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}