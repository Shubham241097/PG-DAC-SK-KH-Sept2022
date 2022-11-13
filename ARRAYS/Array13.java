//13. Write a program to sort an Array in Java ?

import java.util.*;

public class Array13{
	public static void main(String[]args){
		int a[] = new int []{65,14,129,34,7};	
		int b[] = new int[a.length];
		int temp=0;
		//int c=0;
		/*
		for(int i=1;i<=a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i-1]>a[j]){
					temp=
				}
			}
		}
		*/
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}