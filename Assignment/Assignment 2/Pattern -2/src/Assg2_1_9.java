public class Assg2_1_9{
	public static void main(String[]args){
		
		for(int i=1;i<=5;i++){
			for(int k=4;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=4;a>=1;a--){
			for(int c=4;c>=a;c--){
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}