public class Assg2_P_4{
	public static void main(String[]args){
		
		int j,c;
		for(int i=1;i<=9;i++){
			for(int k=8;k>=i;k--){
				System.out.print("  ");			
			}
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
				if (j==i){
					c=j;
				}
			}
			c=j-2;
			//System.out.print("-"+c+"-");
			
				if(c<=i && c>=1){
					do{
						System.out.print(c+" ");
						c--;
					}while(c>0);
				}
			
			System.out.println();	
		}
	}
}