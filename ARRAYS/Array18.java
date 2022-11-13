//18. How to find duplicate elements in a given Array

import java.util.*;

public class Array18{
	public static void main(String[]args){
		int a[] = new int[]{1,2,3,2,5,4,6,4,6,4,7};
		int count = 0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++){
				if(a[i]==a[j])
					count++;
			}
			if(count>0)
			System.out.println("Duplicate elements : "+a[i]);
			count=0;
		}
	}
}