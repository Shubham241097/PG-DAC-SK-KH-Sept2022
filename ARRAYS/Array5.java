//5. Find out smallest and largest number in a given Array?

import java.util.*;

public class Array5{
	public static void main(String[]args){
		int arr1[] = new int[]{12,3,9,4,6};
		
		int a=arr1[0];
		int b=arr1[0];
		
		for(int i=0;i<arr1.length;i++){
			if(a<arr1[i]){
				a=arr1[i];
			}
			
			if(b>arr1[i]){
				b=arr1[i];
			}
		}
		
		System.out.println("Smallest element : "+a);
		System.out.println("Largest element  : "+b);
	}
}