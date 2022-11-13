/*
            *
           * *
          * * *
         * * * *
        * * * * *
          * * *
         * * * *
        * * * * *
       * * * * * *
      * * * * * * *
        * * * * *
       * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
 * * * * * * * * * * * *
* * * * * * * * * * * * *
         * * * *
         * * * *
         * * * *
         * * * *

*/

import java.util.*;
public class Pattern16{
	public static void main(String args[]){
		int i;
		int j;
		int k;
		int l;
		int n;
		
		System.out.println("\nHow many tiers christmas tree you wish to see ?");
		Scanner sc = new Scanner(System.in);
		int tier = sc.nextInt();
		
		int u=0;
		
		for(n=tier ; n>=1 ; n--){
			for(i=1 ; i<=5 ; i++){
				for(j=1 ; j<=(n*2)-2 ; j++)
				{
					System.out.print(" ");
				}
				
				for(k=5-i ; k>=1 ; k--)
				{
					System.out.print(" ");
				}

				for(l=i+u ; l>=1 ; l--)	
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			u=u+2;
			
			if(n==1)
			{
				for(i=1 ; i<=4 ; i++)
				{
					for(j=1 ; j<=(tier*2)-1 ; j++)
					{
							System.out.print(" ");
					}
					
					for(k=1 ; k<=4 ; k++)
					{
							System.out.print("* ");
					}
					System.out.println();
				}
			}
		}		
	}
}