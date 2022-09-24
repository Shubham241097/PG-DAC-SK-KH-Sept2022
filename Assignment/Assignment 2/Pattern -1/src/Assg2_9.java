public class Assg2_9{
	public static void main(String[]args){
		for(char i=65;i<=69;i++){
			for(char k=68;k>=i;k--){
				System.out.print(" ");
			}
			
			for(char j=65;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
