public class Assg2_13{
	public static void main(String[]args){
		for(char i=65;i<=69;i++){
			for(char k=69;k>i;k--){
				System.out.print(" ");
			}
			for(char j=65;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}