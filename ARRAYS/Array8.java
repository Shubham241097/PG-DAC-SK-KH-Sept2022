//8. Write a program which takes an array of integers and prints the running average of 3 
//consecutive integers. 
//In case the array has fewer than 3 integers, there should be no output.
//Input: [5,14,35,89,140]
//Output: [18, 46, 88] 
//(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)

import java.util.*;

public class Array8{
	public static void main(String[]args){
		int a[] = new int []{5,14,35,89,140};
		int b[] = new int [(a.length-2)];
		int sum=0;
		
		
		for(int i=0;i<(a.length-2);i++)
		{
			for(int j=i;j<=i+2;j++){
				sum = sum + a[j];
			}
			//System.out.println((sum)/3);
			b[i]=( (sum)/3 );
			sum =0;
		}
		
		for(int x : b){
			System.out.print(x+" ");
		}
	}
	
}
