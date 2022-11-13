//19. Write a program to sum all the values of a given Array in java?

import java.util.*;

public class Array19{
	public static void main(String[]args){
		int a[] = new int[]{1,2,3,2,5,4,6,4,6,4,7};
		int sum = 0;
		
		for(int i=0;i<a.length;i++){
			sum = sum+a[i];
		}
		System.out.println("Sum of Array : "+sum);
	}
}
