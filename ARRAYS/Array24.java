//24. Write a program to find second largest element in a given Array in java?

import java.util.*;

public class Array24{
	public static void main(String[]args){
		
		int a[] = new int[]{12,70,15,43,99};
		int temp=0;
		int temp1=0;
		
		
		for(int i=0;i<a.length;i++){
			
			if(temp1<a[i]){
				temp=temp1;
				temp1=a[i];
			}
			
		}
		System.out.println("Second largest no : "+temp);
		System.out.println("Largest no : "+temp1);
	}
}