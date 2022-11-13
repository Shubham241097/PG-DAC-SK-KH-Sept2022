//7. Write a program to merge two arrays of integers by reading one number at a time from 
//each array until one of the array is exhausted, and then concatenating the remaining 
//numbers.
//Input: [23,60,94,3,102] and [42,16,74]
//Output: [23,42,60,16,94,74,3,102]


import java.util.*;
public class Array7{
	public static void main(String[]args){
		int a[] = new int[]{23,60,94,3,102};
		int b[] = new int[]{42,16,74};
		int c[] = new int[a.length + b.length];
		int count = 0;
		
		//System.out.println(c.length);
		
		for(int i=0;i<a.length;i++){
			c[count]=a[i];
			count++;
			
			if(i<b.length){
				c[count] = b[i];
				count++;
			}
		}
		
		for(int x : c){
			System.out.print(x+" ");
		}
		
	}
}