//9. Write a program which generates the series 1,4,27,16,125,36


import java.util.*;

public class Array9{
	public static void main(String[]args){
		int a[]= new int[]{1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++){
			if(i%2 == 0)
				System.out.print( (a[i]*a[i]*a[i]) + " ");
			else
				System.out.print(a[i]*a[i]+" ");
		}
	}
}