//2. Write a Java program to check the equality of two arrays?

import java.util.*;
public class Array2{
	public static void main(String[]args){
		
		int arr1[] = new int[]{5,10,15,20,25,30};
		int arr2[] = new int[]{7,13,15,28,41,30};
		//int arr2[] = new int[]{5,10,15,20,25,30};
		
		int count=0;
		
		if(arr1.length == arr2.length){
			
			for(int i=0;i<arr1.length;i++){
				if(arr1[i] != arr2[i]){
					count++;
					break;
				}
			}
			if(count > 0)
				System.out.println("Array are not equal");
			else
				System.out.println("Array are equal");
		}
	}
}