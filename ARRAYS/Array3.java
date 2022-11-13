//3. Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

import java.util.*;

public class Array3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[]{12,3,9,4,6};
		int arr2[] = new int[]{8,7,2,3,5};
		
		System.out.println("Enter the number");
		int n= sc.nextInt();
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				
				if( (arr1[i] + arr2[j]) == n ){
					System.out.println("Index   : "+i +" "+j);
					System.out.println("Element : "+arr1[i]+" "+arr2[j]);
					System.out.println("---------------------------------------");
				}
			}
			
		}
	}
}
