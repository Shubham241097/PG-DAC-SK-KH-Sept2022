public class Assg2_1_7{
	public static void main(String[]args){
		{	
			int c=0;
			
			for(int i=1;i<=5;i++){
				for(int k=4;k>=i;k--){
					System.out.print(" ");
				}
				for(int j=1;j<=i+c;j++){
					System.out.print("*");
				}
				c++;
				System.out.println();
			}
		}// loop 1
		
		{
			int d=3;
			
			for(int a=4;a>=1;a--){
				for(int e=4;e>=a;e--){
					System.out.print(" ");
				}
				for(int b=1;b<=a+d;b++){
					System.out.print("*");
				}
				d--;
				System.out.println();
			}
		}// loop 2
	}
}