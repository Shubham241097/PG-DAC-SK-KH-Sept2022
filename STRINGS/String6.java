//6. How to find duplicate characters in a String?

import java.util.*;
public class String6{
	public static void main(String[]args){
		String s1 = "Java";
		
		char a[] = s1.toCharArray();
		System.out.println(Arrays.toString(a));
		
		int count=1;
		
		for(int i=0;i<a.length;i++){
			for(int j=(i+1);j<a.length;j++){
				
				if(a[i]==a[j]){
					count++;
					System.out.println(a[j]+" : "+count);
				}
			}
			count=1;
		}
	}
}