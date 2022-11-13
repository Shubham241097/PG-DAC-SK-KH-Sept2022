//10. Given an array of integers, print whether the numbers are in ascending order or in 
//descending order or in random order without sorting
//Input: [5,14,35,90,139] Output: Ascending 
//Input: [88,67,35,14,-12] Output: Descending
//Input: [65,14,129,34,7] Output: Random


import java.util.*;

public class Array10{
	public static void main(String[]args){
		int a[] = new int []{5,14,35,90,139};
		//int a[] = new int []{88,67,35,14,-12};
		//int a[] = new int []{65,14,129,34,7};
		int count=0;
		int count1=0;
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]<a[i]){
				count++;
			}

			if(a[i-1]>a[i]){
				count1++;
			}
			
		}
		
		if(count==(a.length-1))
			System.out.println("Ascending");
		else if(count1==(a.length-1))
			System.out.println("Descending");
		else
			System.out.println("Random");
	}
}

