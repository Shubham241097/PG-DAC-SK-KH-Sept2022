public class Assg2_P_5{
	public static void main(String[]args){
		for(int i=9;i>=1;i--){
			for(int k=1;k<i;k++){
				System.out.print("  ");
			}
			for(int c=i;c<=8;c++){
				System.out.print(c+" ");
			}
			for(int j=9;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}