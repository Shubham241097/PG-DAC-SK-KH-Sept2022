public class Assg2_10{
	public static void main(String[]args){
		
		for(char i=69;i>=65;i--){
			
			for(char k=65;k<i;k++){
				System.out.print(" ");
			}
			for(char j=i;j>=i;j++){
				if (j<=69)
				System.out.print(j+" ");
				else
					break;
			}
			System.out.println();
		}
	}
}