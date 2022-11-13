//16. Given two arrays, find the intersection between them?

import java.util.*;

public class Array16{
	public static void main(String[]args){
		int a[] = new int[]{5,10,15,20,25};
		int b[] = new int[]{10,20,30,40,50};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i] == b[j])
					System.out.println(a[i]);
			}
		}
		
		
		/*
		int a[] = new int[]{5,10,15,20,25};
		int b[] = new int[]{10,20,30,40,50};
		int c[] = null;
		
		if(a.length<b.length){
			c = new int[a.length];
		}
		else
			c= new int [b.length];
		
		int index =0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i] == b[j]){
					c[index]=a[i];
					index++;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		*/
	}
}