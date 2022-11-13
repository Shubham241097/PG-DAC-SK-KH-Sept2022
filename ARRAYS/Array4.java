//4. Write a program to reverse an Array in java .

import java.util.*;
public class Array4{
	
	public static void main(String[]args){
		int count=0;
		int arr1[] = new int[]{12,3,9,4,6};
		int temp[] = new int [arr1.length];
		
		for(int i=(arr1.length-1);i>=0;i--){
			temp[count] = arr1[i];
			count++;
		}
		
		for(int x : temp){
			System.out.print(x+" ");
		}
	}
}